package Week1.Module1DesignPatternsAndPrinciples.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        // Register observers
        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        // Simulate stock price changes
        stockMarket.setStockPrice(100.0);
        stockMarket.setStockPrice(101.5);

        // Deregister one observer
        stockMarket.deregister(mobileApp2);

        // Simulate another stock price change
        stockMarket.setStockPrice(102.0);
    }
}
