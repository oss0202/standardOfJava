package stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx9 {
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

//        Optional<Student> result = stream.filter(s->s.getTotalScore() >= 100).findFirst();
//        result.ifPresent(System.out::println);


//        Long cnt = stream.filter(s->s.getTotalScore() >= 100).count();
//        System.out.println(cnt);

//        List<Student> list = stream.filter(s->s.getTotalScore() >= 100).collect(Collectors.toList());
//        list.stream().max(Comparator.comparingInt(Student::getTotalScore)).ifPresent(s-> System.out.println(s));

        IntStream intStream = stream.mapToInt(Student::getTotalScore);
        int sum = intStream.reduce(0,(left, right) -> left + right);
        System.out.println(sum);
    }
}
