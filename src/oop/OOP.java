package oop;

import oop.abstract_classes.Istari;
import oop.classes.Character;
import oop.classes.Warrior;

// OOP Concepts:
// - Encapsulation
// - Interfaces: Are "contract classes", they can't be instanciated, and it's only used by other classes to tell their properties and methods.
// - Abstrations
// - Inheritance
// - Polimorphism

public class OOP {
    public static void main() {
        Character character = new Character("Feanor", "Elf");

        String origin = character.getOrigin();

        System.out.println(origin);

        Warrior warrior = new Warrior("Fingolfin", "Middle Earth");
        warrior.run();
        warrior.attack();
        warrior.reincarnate();

        // Since the class Warrior extends the Istari class, you can set the type of
        // the variable instariWarror as Intari, but in this case, you can only use the methods
        // of the Istari class and interfaces.
        // So it can't use the "walk" method for example.
        Istari instariWarror = new Warrior("Gandalf", "Turgon's Sword");
        instariWarror.reincarnate();
    }
}