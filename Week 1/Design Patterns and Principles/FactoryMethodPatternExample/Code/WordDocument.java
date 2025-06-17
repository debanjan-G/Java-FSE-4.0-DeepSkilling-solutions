package Code;

public class WordDocument implements Document {
    @Override
    public String getContent() {
        return "This is a Word document.";
    }

    @Override
    public String getType() {
        return "Word Document";
    }
}