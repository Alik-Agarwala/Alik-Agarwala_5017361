package Week1.Module1DesignPatternsAndPrinciples.StrategyPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(double amount) {
        paymentStrategy.pay(amount);
    }
}
