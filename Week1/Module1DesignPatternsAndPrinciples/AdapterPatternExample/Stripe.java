package Week1.Module1DesignPatternsAndPrinciples.AdapterPatternExample;

public class Stripe {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
