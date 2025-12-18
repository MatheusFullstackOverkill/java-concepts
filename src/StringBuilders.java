public class StringBuilders {
    public static void main() {
        // Strings in Java are immutable. When you do:
        String a = "a";
        String b = "b";  
        String c = a + b;
        // You are actually creating an thrid Object! Using more space in memory;
        System.out.println(c);

        // When you use StringBuilder, you use less memory space.
        StringBuilder letters = new StringBuilder();

        letters.append(a);
        letters.append(b);

        System.out.println(letters.toString());

        String[] initialLetters = {"a", "b"};
        StringBuilder finalLettersBuilder = new StringBuilder();
        String finalLetters = "";
        for(int i = 0; i < initialLetters.length; i++) {
            // In this scenario, you are creating a new object in every iteration.
            finalLetters = finalLetters + initialLetters[i];
            // In this scenario, you are simply incrementing the same object;
            finalLettersBuilder.append(initialLetters[i]);  
        };
        System.out.println(finalLetters);
        System.out.println(finalLettersBuilder);
    }
}