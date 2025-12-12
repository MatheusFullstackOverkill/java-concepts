public class Arrays {
    public static void runArraysStudies() {
        // Old way of creating an array.
        String[] itemsOldWay = new String[] {"Item 1", "Item 2", "Item 3"};
        // New way of creating an array.
        String[] itemsNewWay = {"Item 1", "Item 2", "Item 3"};

        // The size of an array cannot be changed! If you want an rezisable array, you can use ArrayList.

        // Create an empty array with an fixed length of 4;
        String[] itemsInitialEmpty = new String[4];

        itemsInitialEmpty[0] = "Item 1";

        System.out.println(itemsOldWay);
        System.out.println(itemsNewWay);
        System.out.println(itemsInitialEmpty);

        // You cannot expecify the length of the array and set it's inicial values, like this:
        // String[] items = new String[2] {"Item 1", "Item 2"}
    };
}