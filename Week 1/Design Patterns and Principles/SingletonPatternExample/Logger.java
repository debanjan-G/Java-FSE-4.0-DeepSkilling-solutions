
public class Logger {
    // private static instance
    private static Logger instance;

    // private constructor
    private Logger() {
    }

    // public accessor
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // create the one and only Logger
        }
        return instance; // the same instance is always returned (Singleton Pattern)
    }

    // example method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
