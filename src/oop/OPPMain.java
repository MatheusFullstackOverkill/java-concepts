package oop;

// classes can only be accessed by other packages if they are createad as "public"
public class OPPMain {
    public void run() {
        Character character = new Character("Feanor", "Elf");

        String origin = character.getOrigin();

        System.out.println(origin);
    }
}