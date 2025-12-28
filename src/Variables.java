public class Variables {
    public static void main() {
        // When you declare a variable, like everything in Java, you have to exclicity tell it's type,
        // and you cannot change a variable's value with another type, without changing the variable's type first.

        // Primitives types -
        // they are types of the languange itself;
        // start with an lowercase letter;
        // holds litle space in memory;
        // and cannot be null;
        byte byteVar = 0;
        short shorVar = 0;
        int intVar = 0;
        long longVar = 1000L;
        double doubleVar = 1.0;
        float floatVar = 1.0f;
        // char - it's an string of only one character, and it uses single quotes.
        char charVar = 'a';
        boolean booleanVar = true;

        // Some not Primitives - 
        // they are created by programmers and added to the language;
        // are more robust than primitive types, having a bunch of methods;
        // start with an uppercase letter;
        // holds more space in memory;
        // and can be null;
        String name = "Mágico";
        Integer number = 12121;
        Boolean variable = true;
        // Float float = 122.121;


        // Type casting

        // Implicit type casting
        int initialIntVariable = 0;
        String textVatiable = initialIntVariable + "";

        // Explicit type casting
        double doubleVariable = 0;
        int intFromDoubleVariable = (int) doubleVariable;

        Integer intVariable = Integer.parseInt("1");

        // If the string is in decimal format, ex: 1.5, it will throw an error.
        Integer newIntVariable = Integer.parseInt(textVatiable);

        // So in Java, there are types that simply can't be transformed into others,
        // in these cases you have to think up a logic to change them, for example:
        // I can't change "myText" to an int, so I need to change to an Double, and them to an int.  
        String myText = "1.12";
        Double myTextDouble = Double.parseDouble(myText);
        Integer myTextInt = myTextDouble.intValue();


        // In java you can't have undefined variables!
        // Even if you create an undefined variable, you have to set it's value before use.
        Boolean boolean2;
        // If you run System.out.println(variable2) now, it will throw an error;

        boolean2 = true;
        // Now the print will work because the variable was defined.

        System.out.println(boolean2);

        // But you can have null variables.
        Boolean boolean3 = null;


        // IMPORTANT: remember that primitive type holds less space in memory than non primitive types
        // so be carefull when creating variables with non primitive type unnecessarilly, using more memory space.
        // Two scenarios to keep in mind:
        // - If a variable will not be changed, then maybe it's better to use primitive types.
        // - Analyse the data that will be stored in the database and prepare their correspondant variables in the code
        // accordingly, for example, if you know that an number field won't store a huge number, don't use long type.


        // Other way to declare variables in Java, it's to use "var", in this case, Java will infer the variable's type.
        var inferedString = "My text";
        var inferedNumber = 123;

        System.out.println(inferedString);
        System.out.println(inferedNumber);
    };
}

// Reference: https://www.w3schools.com/java/java_data_types_non-prim.asp