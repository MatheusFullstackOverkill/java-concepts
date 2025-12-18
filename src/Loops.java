import oop.classes.Character;

public class Loops {
    public static void main() {
        Character[] characters = { 
            new Character("Bilbo", "Hobbit"),
            new Character("Gandalf", "Stari"),
            new Character("Feanor", "elf")
        };

        System.out.print("First study:\n\n");

        for(int i = 0; i < characters.length; i++) {
            System.out.println(characters[i].name);
        };

        System.out.print("\nSecond study:\n\n");

        for(int i = 0; i < characters.length; i++) {
            System.out.println(characters[i].getOrigin());
            if(characters[i].getOrigin() != "Shire") {
                continue;
            };

            System.out.println(characters[i].name);
        };

        System.out.print("\nThird study:\n\n");

        for(int i = 0; i < characters.length; i++) {
            System.out.println(characters[i].name);

            if (characters[i].name == "Gandalf") {
                break;
            };
        };

        for(Character character: characters) {
            System.out.println(character);
        };
    }
}