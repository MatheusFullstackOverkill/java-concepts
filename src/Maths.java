public class Maths {
    public static void runMathsStudies() {
        //find the highest number
        Double result = Math.max(1.0, 2.0);
        System.out.println("The highest number: " + result);

        // find the lowest number
        result = Math.min(1.0, 2.0);
        System.out.println("The lowest number: " + result);

        // find the square of x
        Integer number = 64;
        result = Math.sqrt(number);
        System.out.println("The square of " + number + ": " + result);
    }
}