package Week1.Module1DesignPatternsAndPrinciples.SingletonPattern;

public class Logger {

    // Private static instance of the Logger class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code (if needed)
    }

    // Public static method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
