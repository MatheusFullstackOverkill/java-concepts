import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


// Data Structures are classes, provided mainly from the java.utils package,
// that implement interfaces to treat groups of data.
// They bellong the Collections Framework.
public class DataStructures {
    // ArrayList - it's an resizable array, this different from an normal array,
    // you can't just use items[10] in an ArrayList por example;
    public static void runArrayListStudies() {
        ArrayList<String> items = new ArrayList<String>();
        items.add("Car");
        items.add("Motorcycle");

        ArrayList<String> items2 = new ArrayList<String>() {{
            add("Item 1");
            add("Item 2");
            // ArrayList allows duplicates
            add("Item 2");
        }};

        // ArrayList implements the List interface, so you can create an
        // ArrayList and type it as a List. But in case, you cannot access
        // all the extra methods that the ArrayList class has, only the
        // methods from the List interface.

        // The same logic can be applied to all the classes from the
        // Collections Framework, or any class that implements an interface:
        // You can type the instantiation as the interface, but you won't be
        // abble to access all the extra methods from the class.
        List<String> simpleList = new ArrayList<String>();
        simpleList.add("Item 1");

        System.out.println("Lists:");
        System.out.println(items);
        System.out.println(items2);
        System.out.println(simpleList);
    }

    // HashSet - it's an resizable array that does not allow duplicates.
    public static void runHashSetStudies() {
        HashSet<String> items = new HashSet<String>();

        items.add("Item 1");
        items.add("Item 1");

        System.out.println("HashSet:");
        // it won print the second "Item 1"
        System.out.println(items);
    };

    // HashMap - it's an map of key-value items.
    public static void runHashMapStudies () {
        HashMap<String, String> items = new HashMap<String, String>();
        items.put("name", "Matheus");
        items.put("age", "25");
        items.put("info", null);

        System.out.print("HashMap: \n");
        System.out.print(items);
    }

    public static void main() {
        runArrayListStudies();
        runHashSetStudies();
        runHashMapStudies();
    }
}