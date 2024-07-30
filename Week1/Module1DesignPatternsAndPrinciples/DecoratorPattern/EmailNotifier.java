package Week1.Module1DesignPatternsAndPrinciples.DecoratorPattern;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
