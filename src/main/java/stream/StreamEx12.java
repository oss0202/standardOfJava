package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx12 {
    public static void main(String[] args) {
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

        int Total = list.stream().map(Student::getTotalScore).reduce(0, Integer::sum);
        int Total2 = list.stream().map(Student::getTotalScore).reduce(100, Integer::sum);
        System.out.println(Total);
        System.out.println(Total2);

        int Total3 = list.stream().collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println(Total3);

        System.out.println();
        String score = list.stream()
                .map(Student::getTotalScore)
                .map(String::valueOf)
                .collect(Collectors.joining(",", "[" , "]"));
        System.out.println(score);
    }
}
