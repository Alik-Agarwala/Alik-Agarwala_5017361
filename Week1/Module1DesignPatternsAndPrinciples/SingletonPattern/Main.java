package Week1.Module1DesignPatternsAndPrinciples.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // Get the instance of Logger and log a message
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get another instance of Logger and log another message
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verify that both logger1 and logger2 refer to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances of Logger were created.");
        }
    }
}
