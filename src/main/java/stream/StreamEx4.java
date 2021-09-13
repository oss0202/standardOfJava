package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<File> fileStream = Stream.of(
                new File("Ex1.java")
                ,new File("Ex1")
                ,new File("Ex1.bak")
                ,new File("Ex2.java")
        );

        //파일 이름 출력
        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);


        Stream<File> fileStream2 = Stream.of(
                new File("Ex1.java")
                ,new File("Ex1")
                ,new File("Ex1.bak")
                ,new File("Ex2.java")
        );

        fileStream2.map(File::getName)
                .filter(s -> s.indexOf('.')!=-1)
//                .map(s-> s.substring(s.indexOf('.')+1))
                .map(s-> s.substring(0,s.indexOf('.')))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        Stream<File> fileStream3 = Stream.of(
                new File("Ex1.java")
                ,new File("Ex1")
                ,new File("Ex1.bak")
                ,new File("Ex2.java")
        );

        fileStream2.map(File::getName)
                .peek(System.out::println)
                .filter(s -> s.indexOf('.')!=-1)
                .peek(System.out::println)
                .map(s-> s.substring(s.indexOf('.')+1))
                .distinct()
                .forEach(System.out::println);

    }
}
