// Stream API is used to process collections of objects,
// like Arrays, Lists, Sets and Maps.
// Strem in Java is a sequence of functional operations that you make
// in a group of objects, to get a certain result,
// but you cannot change the initial data,
// after you run your operations on it, than you can save the result
// in the same variable, depending of the type of the initial value, or a another variablea.  

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Matheus");
        list.add("João");
        list.add("Paulo");
        list.add("Bruno");

        ArrayList<Integer> numbersList = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};

        // To transform a collection in a stream,
        // you can use the following ways:
        list.stream();
        //or:
        Stream.of(list);

        // Some commom Strem operations,
        // they generally use lambda, but they can also be used with
        // anonymous classes or method references.
        List<String> newList = 
        list.stream()
        .filter(x -> !x.contains("ão"))
        .map(x -> x + "!")
        // After you run your operations, 
        // if you haven't joined the collection into an single item,
        // you have to convert the Stream back to a collection
        // to use it as such, otherwise it will remain an Stream type.
        // You can do it with toList(), toList() or toCollect().
        .toList();

        List<String> newList2 = 
        list.stream()
        .filter(x -> !x.contains("ão"))
        .map(x -> x + "!")
        // In toCollect(), you choose the type of the collection.
        .collect(Collectors.toList());

        String listString =
        list.stream()
        // Reducing the items to an single item of the type of the collection,
        // String, in this case.
        // This reduce you generate an String with an ','
        // in the begging, because I'm setting the first string as empty
        // and after every iteration, I'm adding a comma.
        // Result: , Matheus, João, Paulo, Bruno
        // .reduce("", (a, b) -> a + ", " + b);
        // To fix this:
        // This code will ignore empty strings when joining them.
        .reduce("", (a, b) -> {
            if (a.equals("")) {
                return a + b;
            };

            if (b.equals("")) {
                return a;
            };

            return a + ", " + b;
        });
        // Result: Matheus, João, Paulo, Bruno

        Integer numberSum =
        numbersList.stream()
        // Reducing the items to an single item of the type of the collection
        .reduce(0, (a, b) -> a + b);

        // Other Stream methods:
        // flatMap()
        // distinct()
        // peek()
        // sorted()

        System.out.println(newList);
        System.out.println(newList2);
        System.out.println(listString);
        System.out.println(numberSum);
    }
}