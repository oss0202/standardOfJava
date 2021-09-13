package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx18 {
    public static void main(String[] args) {
        List<MyStudent> list = new ArrayList<MyStudent>(){
            {
                add(new MyStudent("1가자바", true, 1, 1, 310));
                add(new MyStudent("1나자바", false, 1, 1, 210));
                add(new MyStudent("1다자바", true, 1, 1, 110));
                add(new MyStudent("1라자바", true, 1, 2, 320));
                add(new MyStudent("1마자바", false, 1, 2, 220));
                add(new MyStudent("1바자바", true, 1, 2, 120));
                add(new MyStudent("1사자바", true, 1, 3, 310));
                add(new MyStudent("1아자바", false, 1, 3, 210));
                add(new MyStudent("1자자바", true, 1, 3, 110));

                add(new MyStudent("2가자바", false, 2, 1, 310));
                add(new MyStudent("2나자바", true, 2, 1, 210));
                add(new MyStudent("2다자바", true, 2, 1, 110));
                add(new MyStudent("2라자바", false, 2, 2, 320));
                add(new MyStudent("2마자바", false, 2, 2, 220));
                add(new MyStudent("2바자바", true, 2, 2, 120));
                add(new MyStudent("2사자바", false, 2, 3, 310));
                add(new MyStudent("2아자바", true, 2, 3, 210));
                add(new MyStudent("2자자바", true, 2, 3, 110));
            }
        };
        Stream<MyStudent> stream = list.stream();

        // 1. groupingBy
        Map<Integer, List<MyStudent>> stuBan = stream.collect(Collectors.groupingBy(MyStudent::getHak));
        stuBan.forEach((integer, myStudents) -> {
            System.out.println(integer + "반 학생들");
            myStudents.stream().collect(Collectors.groupingBy(MyStudent::isGender)).forEach((aBoolean, myStudents1) -> myStudents1.forEach(System.out::println));
        });
    }
}
