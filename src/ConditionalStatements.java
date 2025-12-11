public class ConditionalStatements {
    public static void runConditionalStatementsStudies() {
        Boolean variable = true;
        Boolean variable2;
        Boolean variable3 = null;

        if(variable) {
            System.out.println("Is true");
            variable2 = true;
        } else {
            System.out.println("Is false");
            variable2 = false;
        };

        if(variable2) {
            System.out.print("Is true \n");
        } else if (variable2 == false) {
            System.out.print("Is false \n");
        } else {
            System.out.print("It undefined \n");
        };

        if(variable3 == null) {
            System.out.print("variable3 is null \n");
        };
    }
}