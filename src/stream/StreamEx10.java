package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx10 {
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
        Stream.of(stream);

        List<Student> list = new ArrayList<Student>(){
            {
                add(new Student("이자바", 3, 300));
                add(new Student("김자바", 1, 200));
                add(new Student("안자바", 2, 100));
                add(new Student("박자바", 2, 150));
                add(new Student("소자바", 1, 200));
                add(new Student("나자바", 3, 290));
                add(new Student("김자바", 3, 180));
            }
        };
        List<String> stringList = list.stream().map(Student::getName).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        stringList.forEach(System.out::println);

        System.out.println();

        list.stream()
                .map(student -> student.getName())
                .map(s -> s.substring(0,1))
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
