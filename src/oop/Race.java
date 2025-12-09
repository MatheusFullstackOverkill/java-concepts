package oop;

import java.util.HashMap;

class Character {
    String name;
    String race;
    HashMap<String, String> raceOrigins = new HashMap<>() {{
        put("human", "Middle Earth");
        put("elf", "Cuiviénen");
        put("dwarf", "a rock");
    }};

    public Character(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getOrigin() {
        return raceOrigins.get(this.race.toLowerCase());
    }
}