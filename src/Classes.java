// Each Java file can only have one class, and it shall have the name of the file.
// Classes can only be accessed by other packages if they are createad as "public".
public class Classes {
    // classes can have properties
    String variable = "Teste";

    // Class can have methods.
    // public - Can be acessed by other classes.
    // void - The type of the return of the function, no return in this case.
    public void printSum(float number, float number2) {
        System.out.println(sum(number, number2));
    }
    // private - Can't be acessed by other classes.
    // float - The type of the return of the function.
    private float sum(float number, float number2) {
        return number + number2;
    }
    // static - A method that can be accessed by other classes without needing to instantiate the current class, ex:
    // Methods.printRandomText();
    public static void printRandomText() {
        System.out.printf("Random text");
    }
    // protected - Can only be used by the classes withing current package.
    // Very folder in Java it's a package.
    protected void print() {
        System.out.println("sss");
    }

    public void printProperty() {
        System.out.println(this.variable);
    }

    public static void printStaticProperty() {
        // 'this' can only be used non static methods,
        // methods that can be ran in non instancited classes.
        System.out.println("Text");   
    }

    public static void runClassesStudies() {
        // You can only use other methods of the class inside a method,
        // if they are static.
        printStaticProperty();
    }
}