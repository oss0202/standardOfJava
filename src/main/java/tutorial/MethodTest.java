package tutorial;

import stream.MyStudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodTest {
    public static void main(String[] args) {
        List<MyStudent> list = new ArrayList<MyStudent>(){
            {
                add(new MyStudent("1가자바", true, 1, 1, 3100));
                add(new MyStudent("1나자바", false, 1, 1, 210));
                add(new MyStudent("1다자바", true, 1, 1, 1100));
                add(new MyStudent("1라자바", true, 1, 2, 320));
                add(new MyStudent("1마자바", false, 1, 2, 220));
                add(new MyStudent("1바자바", true, 1, 2, 1200));
                add(new MyStudent("1사자바", true, 1, 3, 3100));
                add(new MyStudent("1아자바", false, 1, 3, 2100));
                add(new MyStudent("1자자바", true, 1, 3, 1100));

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

        list.stream().sorted(Comparator.comparing(MyStudent::getScore))
                .forEach(myStudent -> {
                    System.out.println(myStudent.toString());
                });
    }
}
