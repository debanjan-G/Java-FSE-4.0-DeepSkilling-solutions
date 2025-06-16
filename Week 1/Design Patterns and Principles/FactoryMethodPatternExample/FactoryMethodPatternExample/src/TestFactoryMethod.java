public class TestFactoryMethod {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        System.out.println("Created: " + wordDocument.getType() + " with content: " + wordDocument.getContent());

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        System.out.println("Created: " + pdfDocument.getType() + " with content: " + pdfDocument.getContent());

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        System.out.println("Created: " + excelDocument.getType() + " with content: " + excelDocument.getContent());
    }
}