package nz.co.stuff.planyourtrip;

import org.springframework.stereotype.Component;

@Component
public class SpringGreeting {
    private final MessagePrinter messagePrinter;

    public SpringGreeting(MessagePrinter messagePrinter) {
        System.out.println("SpringGreeting created");
        this.messagePrinter = messagePrinter;
    }

    public void printGreeting() {
        messagePrinter.printMessage();
    }
}
