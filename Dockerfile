FROM openjdk:11 as compile
WORKDIR /home/source/java

COPY gradlew /home/source/java
COPY *.gradle /home/source/java/
COPY gradle/ /home/source/java/gradle
RUN ./gradlew dependencies

COPY . /home/source/java
RUN ./gradlew build

FROM openjdk:11-jre-slim
WORKDIR /home/application/java
ENV JAR_FILE_NAME="read-your-book-0.0.1-SNAPSHOT.jar"
COPY --from=compile "/home/source/java/build/libs/$JAR_FILE_NAME" .
EXPOSE 8080
ENTRYPOINT java -jar /home/application/java/$JAR_FILE_NAME
