package Week1.Module1DesignPatternsAndPrinciples.FactoryMethodPattern;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document...");
    }
}