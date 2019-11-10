package nz.co.stuff.planyourtrip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
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
