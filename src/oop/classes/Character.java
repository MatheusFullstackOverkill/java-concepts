package oop.classes;

import java.util.HashMap;

public class Character {
    // can be accessed outside of class
    public String name;
    // cannot be accessed outside of class
    private String race;
    public HashMap<String, String> raceOrigins = new HashMap<>() {{
        put("human", "Middle Earth");
        put("elf", "Cuiviénen");
        put("dwarf", "a rock");
        put("hobbit", "Shire");
        put("stari", "Amam");
    }};

    // Constructor - it's a method that automaticly runs whenever a class is called with "new";
    public Character(String name, String race) {
        this.name = name;
        this.race = race;
        System.out.println("Using class");
    }

    public String getOrigin() {
        return raceOrigins.get(this.race.toLowerCase());
    }
}