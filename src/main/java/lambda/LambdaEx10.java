package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx10 {
    public static void main(String[] args) {
        // 1. Runnable
        Runnable runnable = ()-> System.out.println("Runnable call");
        runnable.run();

        // 2. Supplier
        Supplier<Integer> integerSupplier = () -> {
            System.out.println("Supplier<Integer> call");
            return 11;
        };
        System.out.println(integerSupplier.get());

        // 3.Consumer
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Consumer<String> call");

        // 4. Function
        System.out.println("Function<Integer, String> call");
        Function<Integer, String> integerStringFunction = a -> "리턴 값 :  " + a;
        System.out.println(integerStringFunction.apply(11));

        // 5. Predicate
        System.out.println("Predicate<Integer> call");
        Predicate<Integer> integerPredicate = a -> a instanceof Integer ? true : false;
        System.out.println(integerPredicate.test(11));

    }
}
