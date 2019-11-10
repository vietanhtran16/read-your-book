package nz.co.stuff.planyourtrip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * To run this bean, execute the application with:
 * ./gradlew bootRun --args='--spring.profiles.active=fancy'
 * or
 * java -jar jar-name --spring.profiles.active=fancy
 */
@Component
@Profile("fancy")
public class FancyMessagePrinter implements MessagePrinter {
    private final String message;

    public FancyMessagePrinter(@Value("${pyt.greeting}") String message) {
        System.out.println("FancyMessagePrinter created");
        this.message = message;
    }

    @Override
    public void printMessage() {
        String line = message.replaceAll(".", "-");
        System.out.println(line);
        System.out.println(message);
        System.out.println(line);
    }
}
