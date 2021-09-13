package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        System.out.println("----------Stream 출력--------");
        String[] strings = {"ccc", "bbb", "aaa"};
        List<String> list = Arrays.asList(strings).stream().sorted().collect(Collectors.toList());
        Arrays.asList(strings).stream().sorted().forEach(System.out::println);


        System.out.println("-----------Stream 중간연산 추가-------");
        String[] strings2 = {"ccc", "bbb", "aaa","ccc","bbb"};
        Stream<String> stream = Arrays.stream(strings2);

        stream.distinct().sorted().limit(2).forEach(System.out::println);

        System.out.println("-----------Stream filter 테스트-------");
        String[] strings3 = {"ccc", "bbb", "aaa","ccc","bbb", "aaaa","bbbb","cccc"};
        Stream<String> stream3 = Arrays.stream(strings3);

        stream3.filter((var)->var.length()<4).distinct().sorted().forEach(System.out::println);
        System.out.println("--------------------");


    }
}
