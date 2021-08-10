package lambda;

import java.util.function.Function;

public class LambdaEx6 {
    public static void main(String[] args) {
        Function<String, Integer> f1 = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f2= Integer::parseInt;
        System.out.println(f1.apply("123"));
        System.out.println(f2.apply("123"));
    }
}
