package Week1.Module1DesignPatternsAndPrinciples.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Create a simple email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Wrap the email notifier with SMS and Slack decorators
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier completeNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        // Send notifications
        System.out.println("Sending only email notification:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nSending email and SMS notifications:");
        smsAndEmailNotifier.send("Hello via Email and SMS!");

        System.out.println("\nSending email, SMS, and Slack notifications:");
        completeNotifier.send("Hello via Email, SMS, and Slack!");
    }
}
