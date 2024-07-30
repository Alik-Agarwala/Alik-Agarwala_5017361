package Week1.Module1DesignPatternsAndPrinciples.ObserverPatternExample;

public interface Stock {
    void register(Observer observer);
    void deregister(Observer observer);
    void notifyObservers();
}
