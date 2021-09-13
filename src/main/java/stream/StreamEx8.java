package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamEx8 {
    public static void main(String[] args) {
//        Optional<String> s = Optional.of(null);
        Optional<String> s = Optional.ofNullable(null);

        Optional<Student> optionalStudent = Optional.ofNullable(new Student("이자바", 3, 300));
        Student student = optionalStudent.orElseGet(Student::new);
        System.out.println(student.toString());

        s.<Student>empty();

        String name = Optional.of(student)
                .map(Student::getName)
                .orElse("이름이 없습니다.");
        System.out.println(name);

        List<String> values0 = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
            }
        };

        List<Student> students = new ArrayList<Student>(){
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
        Optional<List<Student>> list = Optional.of(students);
        list.filter(List::isEmpty).ifPresent(var -> System.out.println(list.get().toString()));







    }
}

