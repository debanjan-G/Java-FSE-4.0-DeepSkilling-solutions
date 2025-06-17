package Code;

public class ExcelDocument implements Document {
    @Override
    public String getContent() {
        return "This is an Excel document.";
    }

    @Override
    public String getType() {
        return "Excel Document";
    }
}