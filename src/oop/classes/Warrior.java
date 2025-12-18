package oop.classes;
import oop.abstract_classes.Istari;
import oop.interfaces.LivingBeing;

// Example of Abstration, when one class extends another.
// The abstract class Warrior can access all of the Istari class properties and methods.
// extends - keyword to "use" another class, as "Super Class", ex: extends BaseClass.
// implements - keyword to use an interface, or multiple interfaces, ex: implements Interface1, Interface2.
public class Warrior extends Istari implements LivingBeing {
    // Example of Encapsulation.
    // All the properties of classes should not be directly accessed from outside the class,
    // this is to garantee security of the system.
    // To access or change a class properties, it's recomended to use Getters and Setters, as seen bellow.
    private String name;
    private String weapon;

    public Warrior(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    };

    // Getter
    public String getName() {
        return this.name;
    };

    public String getWeapon() {
        return this.weapon;
    };

    // Setter
    public void setName(String name) {
        this.name = name;
    };
    
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    };

    public void attack() {
        // Using a method from Istari class, the "Super Class",
        // that what's called the class wich the current class extends.
        // This is an example of Inheritance, when a class inherits properties and methods of another class.
        useMagic();
    };

    // Overriding a method from the extended class, the "Super Class".
    // This is an example of Polimorphism, when a class extends another, and
    // the bevahior of the Super Class changes depending on the class that's using it.
    @Override
    public void useExpecificSpell() {
        System.out.println("Use fire spell!");
    };

    // Overriding the breathe method of the LivingBeing interface.
    @Override
    public void breathe() {
        System.out.println("breathe");
    };

    // Overriding the walk method of the LivingBeing interface.
    @Override
    public void walk() {
        System.out.println("Walk");
    };

    // Overriding the run method of the LivingBeing interface.
    @Override
    public void run() {
        System.out.println("run");
    };
}