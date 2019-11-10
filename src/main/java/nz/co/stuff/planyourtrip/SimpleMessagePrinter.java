package nz.co.stuff.planyourtrip;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessagePrinter implements MessagePrinter {
    public SimpleMessagePrinter() {
        System.out.println("SimpleMessagePrinter created");
    }

    @Override
    public void printMessage() {
        System.out.println("Message from SimpleMessagePrinter");
    }
}
