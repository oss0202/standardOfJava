package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx13 {
    public static void main(String[] args) {
        Stream<Student2> stuStream = Stream.of(
                new Student2("1가자바",true, 1, 1, 300)
                ,new Student2("1나자바",true, 1, 1, 300)
                ,new Student2("1다자바",true, 1, 1, 300)
                ,new Student2("1라자바",true, 1, 2, 300)
                ,new Student2("1마자바",true, 1, 2, 300)
                ,new Student2("1바자바",true, 1, 2, 300)
                ,new Student2("1사자바",true, 1, 3, 300)
                ,new Student2("1아자바",true, 1, 3, 300)
                ,new Student2("1자자바",true, 1, 3, 300)

                ,new Student2("2가자바",true, 2, 1, 300)
                ,new Student2("2나자바",true, 2, 1, 300)
                ,new Student2("2다자바",true, 2, 1, 300)
                ,new Student2("2라자바",true, 2, 2, 300)
                ,new Student2("2마자바",true, 2, 2, 300)
                ,new Student2("2바자바",true, 2, 2, 300)
                ,new Student2("2사자바",true, 2, 3, 300)
                ,new Student2("2아자바",true, 2, 3, 300)
                ,new Student2("2자자바",true, 2, 3, 300)
        );

        // 1. 기본 분할
        Map<Boolean, List<Student2>> stuByMale = stuStream.collect(Collectors.partitioningBy(Student2::isMale));
        stuByMale.forEach((aBoolean, student2s) -> {
            if(aBoolean){
                student2s.forEach(System.out::println);
            }
        });
    }
}
