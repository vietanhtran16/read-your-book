package nz.co.stuff.planyourtrip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class SimpleMessagePrinter implements MessagePrinter {
    private final String message;

    public SimpleMessagePrinter(@Value("${pyt.greeting}") String message) {
        System.out.println("SimpleMessagePrinter created");
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.println(message);
    }
}
