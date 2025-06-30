// TestLogger.java
public class TestLogger {
    public static void main(String[] args) {
        // Get logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        // Test if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified).");
        } else {
            System.out.println("Logger instances are different (Singleton failed).");
        }
    }
}

