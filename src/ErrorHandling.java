public class ErrorHandling {
    public static void runErrorHandlingStudies() {
        try {
            String[] items = {"Item 1"};

            System.out.println(items[10]);
        } catch(Exception e) {
            System.out.println(e);
        };

        try {
            throw new Exception("Forced error");
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The try-catch was closed");
        };

        System.out.println("Closing line");
    }
}