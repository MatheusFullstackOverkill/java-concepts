import oop.*;

public class App {
    // The method "main" it's an special method that runs first them the JVM reads the code.
    // It's the endtrypoint of the application. If I run: java App.java, it will read this file in the folder,
    // and run this method, and only compiles the files that this file calls.
    public static void main(String[] args) {
        System.out.println("Welcome to the begging of my Java Journey");

        Classes.printRandomText();
        Variables.runVariablesStudies();
        UserInput.runUserInputStudies();
        Maths.runMathsStudies();
        Dates.runDatesStudies();
        Enums.runEnumStudies();
        ConditionalStatements.runConditionalStatementsStudies();
        Arrays.runArraysStudies();
        Loops.runLoopsStudies();
        DataStructures.runDataStructuresStudies();
        Generics.runGenericsStudies();
        ErrorHandling.runErrorHandlingStudies();
        Annotations.runAnnotationsStudies();
        StringBuilders.main();
        OOP.main();
    }
}