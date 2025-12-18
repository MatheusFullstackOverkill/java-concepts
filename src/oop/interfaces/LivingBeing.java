package oop.interfaces;

// Interfaces are "contracts" that classes can implement to expecify
// their methods, their behavior. Generally is used by classes not nescessary close related,
// for example: bird and a plane are very much different being, but both can fly.
// You can create an Bird class, and an Plan class, and both implement the Flying interface.
public interface LivingBeing {
    public void breathe();

    public void walk();

    public void run();
}