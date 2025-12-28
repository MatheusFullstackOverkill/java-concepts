import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main() {
        Scanner scannerObject = new Scanner(System.in);
        
        try {
            System.out.println("Full name");

            // nextLine reads the string input of the user
            String fullname = scannerObject.nextLine();

            System.out.println("Age");

            // nextInt reads the input of the user as an integer,
            // if the user inputs a diferent type of data, it will emit an error,
            // the same logic is applied to other "next" methods, there's one for every primitive type.
            Integer age = scannerObject.nextInt();

            System.out.println("Salary");
            Double salary = scannerObject.nextDouble();

            System.out.println("Wake up "+ fullname + "!");
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        } catch (Exception e) {
            System.out.println("An error has ocurred");

            if(e instanceof InputMismatchException) {
                System.out.println("Error: Invalid input");
            };

            System.out.println("Details: " + e.toString());
        };

        // The scanner should be closed after it's usage.
        scannerObject.close();
    }
}