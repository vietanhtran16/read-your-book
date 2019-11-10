package nz.co.stuff.planyourtrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PlanYourTripApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(PlanYourTripApplication.class, args);
		SpringGreeting springGreetingBean = applicationContext.getBean(SpringGreeting.class);
		springGreetingBean.printGreeting();
	}

}
