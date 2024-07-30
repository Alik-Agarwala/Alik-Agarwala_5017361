package Week1.Module1DesignPatternsAndPrinciples.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document...");
    }
}
