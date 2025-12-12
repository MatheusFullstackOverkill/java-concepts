public class Variables {
    public static void runVariablesStudies() {
        // Primitives types -
        // they are types of the languange itself;
        // start with an lowercase letter;
        // holds litle space in memory;
        // and cannot be null;
        byte byteVar = 0;
        short shorVar = 0;
        int intVar = 0;
        long longVar = 0;
        double doubleVar = 1.0;
        float floatVar = 1.0f;
        // char - it's an string of only one character
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
        Integer intVariable = Integer.parseInt("1");
        String textVatiable = intVariable + "";

        // Explicit type casting
        // If the string is in decimal format, ex: 1.5, it will throw an error.
        Integer newIntVariable = Integer.parseInt(textVatiable);

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
    };
}

// Reference: https://www.w3schools.com/java/java_data_types_non-prim.asp