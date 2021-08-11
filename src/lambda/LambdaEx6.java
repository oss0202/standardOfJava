package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaEx6 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f2= Integer::parseInt;
        System.out.println(f1.apply("123"));
        System.out.println(f2.apply("123"));

        Function<String, Integer> f3 = String::hashCode;
        f3.apply("123123");

        List<String> list = Arrays.asList("red","orangd", "yellow","green");
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
