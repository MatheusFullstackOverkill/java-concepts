// Class it's a model, you use it to define the "shape" of objects, their properties and methods.
// Ex: a Person class can have the properties: name, birthdate, country of origin and etc.

// Access modifiers - Are all this names before the classes, attributes, and methods, other than the types,
// that tells who can access this class, attribute or method. Examples: public, private, protected and default.
// When a class it's defined without any access modifier, has the "default" effect: only classes within it's package can access it.

// Classes can only be accessed by other packages/ files if they are createad as "public".
// Each Java file can needs to have at least one class, and it shall have the name of the file.
// It can have other classes, but those can't be marked as "public", and can't have the name of the file.

// Packages - Very folder in Java it's a package.

// Access modifiers in the context of classes:
// public - Can be acessed by other packages.
// private - Can't be accesed by other packages.
// protected - Can only be accessed by current package.
// If a class doesn't have an access modifier, it is considered as "package protected",
// meaning that it can only be accessed in it's current package.
public class Classes {
    // Class can have properties/attributes and methods.

    // Access modifiers in the context of attributes and methods:  
    // public - Can be acessed by other packages.
    // private - Can't be accesed by other packages.
    // protected - Can only be accessed by current package. 
    // If an attribute or method doesn't have an access modifier, it is considered as "package protected",
    // meaning that it can only be accessed in it's current package, but not by subclasses!
    // So if you extend a class with an package protected attribure, the subclass can't access it.

    // Atributes

    String variable = "Test";
    // it's NOT recomend to use "public" in properties/attributes, only in methods.
    public String publicText = "";
    // It's recomended to use "private" for properties/attributes, to keep the class functionally secured.
    // It's ideal to set attributes as private and only access them externally by Getters and Setters, as shown bellow.
    private String privateText = "";

    // static - An attributes or method that can be accessed by other classes without needing to instantiate the current class.
    // When you want to access static attributes or methods inside the current class, only other static attributes or methods can access them!
    private static String privateStaticString = "Private string";
  

    // Methods

    // Method definition structure:
    // Access modifier - (it can have the keywork "static") - type of method's return - method's name
    public void printSum(float number, float number2) {
        System.out.println(sum(number, number2));
    }

    private float sum(float number, float number2) {
        return number + number2;
    }

    protected void print() {
        System.out.println("Random text protected");
    }

    public void printProperty() {
        // 'this' can only be used non static methods
        System.out.println(this.variable);
    }

    public static void printStaticText() {
        System.out.printf(privateStaticString);
    }

    // Getter
    public void getPrivateText() {
        System.out.println(this.privateText);   
    }

    // Setter
    public void setPrivateText(String privateText) {
        this.privateText = privateText;
    }

    public static void main() {
        // You can only use other static attributes/methods of the class inside a static method.
        printStaticText();
    }

    // Constructor - it's a method that automatically runs whenever a class is instantiated, called with "new";
    public Classes(String privateText) {
        this.privateText = privateText;
    }
}