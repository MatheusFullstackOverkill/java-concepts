package oop.abstract_classes;

import oop.interfaces.Immortal;

// An Abstract Class it's used by other classes, close related, that share some properties and methods,
// the ideia is prevent code repetition.
// Abstract Classes can't be instantiated.
// A class can extend only one other class.
// A class doesn't has to be "abstract" to can be used by others.
public abstract class Istari implements Immortal {
    // An empty method that the classes that will extend this one will use in their own way,
    // when that happens, it's an example of Polimorphism.    
    public void useExpecificSpell() {};

    public void useMagic() {
        System.out.println("Use magic!");
    };

    // Overriding the reincarnate method of the Immortal interface.
    @Override
    public void reincarnate() {
        System.out.println("reincarnate");
    };
}