// Generics are classes that can accept any data types.
// IMPORTANT: More than one class in a file it's not ideal, this is only for study purposes.
class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return this.value;
    }
}

public class Generics {
    public static void runGenericsStudies() {
        Box<String> box = new Box<String>();

        box.value = "Makita";

        System.out.println(box.get());
    }
}