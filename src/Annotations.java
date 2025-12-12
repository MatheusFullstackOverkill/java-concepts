// Annotations and special notes that start with @ and don't change how the code works,
// but it tells the compiler what to in certain parts of your code.

// Some common Annotations
// @Override - Indicates that a method overrides a method in a superclass;
// @Deprecated - Indicates that a method it's deprecated and it's not recomend to be used;
// @SuppressWarning - Tells the compiler to ignore certain wargings;

class Warrior {
    public void attack() {}
}

class Wizard extends Warrior {
    @Override
    public void attack() {
        System.out.println("Attack with magic!");
    }
}

public class Annotations {
    public static void runAnnotationsStudies() {
        Wizard wizard = new Wizard();

        wizard.attack();
    }
}