package oop;

// classes can only be accessed by other packages if they are createad as "public"
public class OPP {
    public static void runOOPStudies() {
        Character character = new Character("Feanor", "Elf");

        String origin = character.getOrigin();

        System.out.println(origin);
    }
}