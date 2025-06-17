package Code;

public class TestLogger {
    public static void main(String[] args) {
        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();

        loggerA.log("Logging via loggerA");
        loggerB.log("Logging via loggerB");

        // Should print 'true' because both refs point to the same instance
        System.out.println("Same instance? " + (loggerA == loggerB));
    }
}