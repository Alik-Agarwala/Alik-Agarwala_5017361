package Week1.Module1DesignPatternsAndPrinciples.AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        // Using PayPal payment gateway
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(100.0);

        // Using Stripe payment gateway
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(200.0);

        // Using Square payment gateway
        PaymentProcessor squareProcessor = new SquareAdapter(new Square());
        squareProcessor.processPayment(300.0);
    }
}
