package Week1.Module1DesignPatternsAndPrinciples.FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document...");
    }
}
