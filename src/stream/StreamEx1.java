package stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        String[] strings = {"ccc", "bbb", "aaa"};
        List<String> stringList = Arrays.asList(strings);

        Stream<String> stringStream1 = stringList.stream();
        Stream<String> stringStream2 = Arrays.stream(strings);
        Stream<String> stringStream3 = Arrays.stream(strings);

        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        stringStream1.sorted().forEach(System.out::println);
        System.out.println("-------------------------------");
        stringStream2.sorted().forEach(System.out::println);
        System.out.println("-------------------------------");
        stringStream3.sorted().forEach((str)-> System.out.println(str));


        System.out.println("-------------------------------");
        String[] strings1 = {"aaa","ccc", "bbb", "aaa"};
        Stream<String> stringStream = Arrays.stream(strings1);
        stringStream.distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------------");
        String[] strings2 = {"dd", "aaa", "CC", "cc", "b"};
        Stream<String> stringStream4 = Stream.of(strings2);
        System.out.println(stringStream4.distinct().sorted().limit(5).count());


        Map<String, Integer> stringIntegerMath = new HashMap<>();
        stringIntegerMath.put("A",1);
        stringIntegerMath.put("B",2);
        stringIntegerMath.put("C",3);
        stringIntegerMath.put("D",4);
        stringIntegerMath.put("E",5);

        Iterator<String> stringIterator = stringIntegerMath.keySet().iterator();
        while (stringIterator.hasNext()){
            stringIterator.next() ;
        }
//        stringIterator.next();


    }
}
