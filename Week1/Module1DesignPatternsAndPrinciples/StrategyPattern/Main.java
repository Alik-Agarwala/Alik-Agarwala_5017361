package Week1.Module1DesignPatternsAndPrinciples.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext;

        // Pay using Credit Card
        paymentContext = new PaymentContext(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        paymentContext.payAmount(100.0);

        // Change to PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        paymentContext.payAmount(200.0);
    }
}
