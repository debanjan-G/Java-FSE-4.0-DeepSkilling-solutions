public class PdfDocument implements Document {
    @Override
    public String getContent() {
        return "This is a PDF document.";
    }

    @Override
    public String getType() {
        return "PDF";
    }
}