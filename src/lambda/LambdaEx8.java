package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx8 {
    public static void main(String[] args) {
        //기존
        List<String> lists = Arrays.asList("aaa","bbb","ccc","aaa");

        Collections.sort(lists, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Stream<String> s = lists.stream();
        s.forEach(System.out::println);
        System.out.println("-------------------");

        //람다식
        lists = Arrays.asList("aaa","bbb","ccc","aaa");
        Collections.sort(lists, (s1, s2) -> s1.compareTo(s2));
        lists.stream().forEach(System.out::println);
    }
}
