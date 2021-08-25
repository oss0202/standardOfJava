package stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
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

        IntStream intStream = stream.mapToInt(Student::getTotalScore);
        IntSummaryStatistics stat = intStream.summaryStatistics();
        System.out.println("count : " + stat.getCount());
        System.out.println("sum : " + stat.getSum());
        System.out.printf("average : %.2f%n", stat.getAverage());
        System.out.println("min : " + stat.getMin());
        System.out.println("max : " + stat.getMax());

    }
}
