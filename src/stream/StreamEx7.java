package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx7 {
    public static void main(String[] args) {
        String[] linStrings = {
                "Belive or not It is true"
                ,"Do or do not There is no try"
        };
        Stream<String> lineStream = Arrays.stream(linStrings);
//        lineStream.map(line-> Stream.of(line.split(" +")));
        Stream<String> stringStream=lineStream.flatMap(s->Stream.of(s.split(" +")));
        stringStream.forEach(System.out::println);
    }
}
