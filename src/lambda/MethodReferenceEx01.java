package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceEx01 {
    public static void main(String[] args) {
        //1. static 메서드 참조
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f2 = Integer::parseInt;

        //2. 인스턴스메서드 참조
        BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> f4 =String::equals;
        Function<String, Boolean> f7 = MethodReferenceEx01::sample;//메서드 참조

        //3. 특정 객체 인스턴스메서드 참조
        MethodReferenceEx01 obj = new MethodReferenceEx01();
        Function<String, Boolean> f5 = (x) -> obj.equals(obj);//람다식
        Function<String, Boolean> f6 = obj::equals;//메서드 참조

    }
    public static boolean sample(String sample){
        return true;
    }
}
