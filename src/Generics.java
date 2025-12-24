// Generics are classes that can accept any data types.
// IMPORTANT: More than one class in a file it's not ideal, this is only for study purposes.

// To create a class with generic types, you have to create it with the <> symbos,
// and with of your choice between then, this symbolizes the type that will need to be passed
// when you'll want to use this class.

class SingleItemBox<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return this.value;
    }
}

class MultipleItemsBox<I> {
    private I[] items;

    void set(I[] items) {
        this.items = items;
    }

    I get(int index) {
        return this.items[0];
    }

    I[] getAll() {
        return this.items;
    }
}

// A class that needs 3 types, they can be the same or not.
class Band<A, B, C> {
    private A member1;
    private B member2;
    private C member3;

    public Band(A member1, B member2, C member3) {
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
    }

    // Object it's like an "any" type.
    Object[] getAllMembers() {
        Object[] allMembers = {member1, member2, member3};

        return allMembers;
    }
}

interface MagicianTricks {
    public void performCardTrick();
}

class Magician implements MagicianTricks {
    private String name;

    public Magician(String name) {
        this.name = name;
    };

    public String getName() {
        return this.name;
    }

    @Override
    public void performCardTrick() {
        System.out.println("Perform card trick");
    }
}

// A class with a generic that could anything, excepts it depemends
// to extends (implements) the interface MagicianTricks.
// If MagicianTricks was an abstract class, it would be the same sintax. 
class MagiciansBox<I extends MagicianTricks> {
    private I magician;

    public MagiciansBox(I magician) {
        this.magician = magician;
    };

    public void cutInHalf() {
        this.magician.performCardTrick();
    }
}

public class Generics {
    public static void main() {
        SingleItemBox<String> box = new SingleItemBox<String>();
        box.value = "Makita";

        System.out.println(box.get());

        MultipleItemsBox<String> box2 = new MultipleItemsBox<String>();
        String[] items = {"Item 1", "Item 2", "Item 3"};
        box2.set(items);
        
        System.out.println(box2.getAll());

        Band<String, String, String> myBand = new Band<String, String, String>("Matheus", "Bruno", "João");

        System.out.println(myBand.getAllMembers());

        Magician magician = new Magician("Matheus");
        MagiciansBox<Magician> magiciansBox = new MagiciansBox<Magician>(magician);

        magiciansBox.cutInHalf();
    }
}