package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(
                new Student("이자바", 3, 300)
                ,new Student("김자바", 1, 200)
                ,new Student("안자바", 2, 100)
                ,new Student("박자바", 2, 150)
                ,new Student("소자바", 1, 200)
                ,new Student("나자바", 3, 290)
                ,new Student("김자바", 3, 180)
        );

        stream.sorted(Comparator.comparing(Student::getBan)// 반별 기본정렬
                    .thenComparing(Comparator.naturalOrder())// 기본정렬
                ).forEach(System.out::println);
    }
}
