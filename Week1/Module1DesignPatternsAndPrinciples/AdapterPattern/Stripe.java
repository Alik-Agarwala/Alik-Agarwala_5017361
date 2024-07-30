package Week1.Module1DesignPatternsAndPrinciples.AdapterPattern;

public class Stripe {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
