package Week1.Module1DesignPatternsAndPrinciples.FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {
        // Create a Word document using the factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open(); // Outputs: Opening a Word document...

        // Create a PDF document using the factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open(); // Outputs: Opening a PDF document...

        // Create an Excel document using the factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open(); // Outputs: Opening an Excel document...
    }
}
