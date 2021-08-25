package stream;

import java.util.Optional;

public class StreamEx8 {
    public static void main(String[] args) {
//        Optional<String> s = Optional.of(null);
        Optional<String> s = Optional.ofNullable(null);

        Optional<Student> optionalStudent = Optional.ofNullable(new Student("이자바", 3, 300));
        Student student = optionalStudent.orElseGet(Student::new);
        System.out.println(student.toString());

        s.<Student>empty();

        Optional.of(student)
                .map(Student::getName)
                .orElse("이름이 없습니다.");






    }
}
