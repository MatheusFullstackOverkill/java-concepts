import oop.*;

public class App {
    // The method "main" it's an special method that runs first them the JVM reads the code.
    // It's the endtrypoint of the application. If I run: java App.java, it will read this file in the folder,
    // and run this method, and only compiles the files that this file calls.
    public static void main(String[] args) {
        System.out.println("Welcome to the begging of my Java Journey");

        Introduction.main();
        GarbageCollector.main();
        Classes.main();
        Variables.main();
        UserInput.main();
        Maths.main();
        Dates.main();
        Enums.main();
        ConditionalStatements.main();
        ErrorHandling.main();
        Arrays.main();
        Loops.main();
        DataStructures.main();
        Annotations.main();
        StringBuilders.main();
        Generics.main();
        OOP.main();
        Records.main();
        Lambda.main();
        StreamAPI.main();
        DatabaseIntegrations.main();
        Dependencies.main();
        Files.main();
    }
}