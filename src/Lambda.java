// Lambdas were introduced in Java 8, and are very similar to arrow functions of Javascript,
// that makes sense because the porpuse of Lambdas are to introduce to Java some functional programming logic,
// simplying code.
// Lambdas are most used in methods.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


// An interface with a single method it's called a Functional Interface,
// most used for Lambdas.
// You can and FunctionalInterface Annotation to tell the compiler and
// other developers that this interface is functional.
// This annotation with throw an error if you add. another method.
// This is not an requirement.
@FunctionalInterface
interface Calculate {
    public Integer calculate(Integer number1, Integer number2);
}

// The "Class way" of during the above code, it will make sense further.
class CalculateClass implements Calculate {
   @Override
   public Integer calculate(Integer number1, Integer number2) {
        return number1 + number2;
   };
}

public class Lambda {
    // Lambdas can be stored in variables to be used in methods, like this:
    // You have to declare an Interface with a method that when implemented,
    // will execute the code of your Lambda.
    private static Calculate calculateLambda = (a, b) -> a + b;

    // Java already has a few very handy functional interfaces prepared.
    // Consumer simply expected an parameter of any type and does not return anything,
    // it's used for example in the forEach method.
    private static Consumer<Integer> addOneToNumber = (n) -> {
        Integer calculation = n + 1;
        System.out.println(calculation);
    };

    // A method that expected an entity that uses the Calculate interface,
    // it can be an Class or an Lambda expression, as long it has the calculate method in this case.
    private static void calculate(Integer number1, Integer number2, Calculate calculateEntity) {
        System.out.println(calculateEntity.calculate(number1, number2));
    }

    public static void main() {
        List<String> items = Arrays.asList("Z", "A", "D");
        List<Integer> numberItems = Arrays.asList(1, 2, 3);

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));  
        };

        for (String item: items) {
            System.out.println(item);
        };

        // An example of Lambda function, used in a method.
        items.forEach(x -> System.out.println(x));

        // Lambdas are used very ofter also in the context of Strems:
        List<String> sortedItems = items.stream().sorted((a, b)-> a.compareTo(b)).collect(Collectors.toList());

        System.out.println(sortedItems);

        numberItems.forEach(addOneToNumber);

        // The Class way
        CalculateClass calculateClassVariable = new CalculateClass();
        calculate(1, 2, calculateClassVariable);

        // The Lambda way
        calculate(1, 2, calculateLambda);
    }
}