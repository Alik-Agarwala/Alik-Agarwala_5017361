package Week1.Module1DesignPatternsAndPrinciples.FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document...");
    }
}
