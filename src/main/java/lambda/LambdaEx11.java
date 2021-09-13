package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx11 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("가1");
        stringList.add("가2");
        stringList.add("가3");
        stringList.add("가4");
        stringList.add("가5");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("가1");
        stringList2.add("가2");
        stringList2.add("가3");
        stringList2.add("가4");
        stringList2.add("가5");
//        stringList.forEach((s -> System.out.println(s)));

        Arrays.asList(stringList, stringList2).forEach(lists -> lists.forEach(System.out::println));

        String[] a = new String[]{"1","2","3"};
//        Arrays.asList(a).forEach(System.out::println);
        Arrays.asList("1", "2", "3").forEach(System.out::println);



    }
}
