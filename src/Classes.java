// Class it's a model, you use it to define the "shape" of objects, their properties and methods.
// Ex: a Person class can have the properties: name, birthdate, country of origin and etc.

// Access modifiers - Are all this names before the classes, attributes, and methods, other than the types,
// that tells who can access this class, attribute or method. Examples: public, private, protected and default.
// When a class it's defined without any access modifier, has the "default" effect: only classes within it's package can access it.

// Classes can only be accessed by other packages/ files if they are createad as "public".
// Each Java file can needs to have at least one class, and it shall have the name of the file.
// It can have other classes, but those can't be marked as "public", and can't have the name of the file. 
public class Classes {
    // Class can have properties/attributes and methods.

    // classes can have properties/attributes
    String variable = "Test";
    // it's NOT recomend to use "public" in properties/attributes, only in attributes
    public String publicVariable = "";
    // It's recomended to use "private" for properties/attributes
    private String privateVariable = "";

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
    // protected - Can only be used by the classes withing current package.
    // Very folder in Java it's a package.
    protected void print() {
        System.out.println("Random text protected");
    }
    // static - A method that can be accessed by other classes without needing to instantiate the current class, ex:
    // Methods.printRandomText();
    public static void printRandomText() {
        System.out.printf("Random text");
    }

    public void printProperty() {
        // 'this' can only be used non static methods
        System.out.println(this.variable);
    }

    public static void printStaticProperty() {
        // methods that can be ran in non instancited classes.
        System.out.println("Text");   
    }

    public static void runClassesStudies() {
        // You can only use other methods of the class inside a method,
        // if they are static.
        printStaticProperty();
    }
}