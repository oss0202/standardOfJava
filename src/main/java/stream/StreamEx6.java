package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        Stream<String[]> stream = Stream.of(
                new String[]{"abc", "def","ghi"}
                ,new String[]{"ABC", "GHI","JKLMN"}
        );
        Stream<String[]> stream2 = Stream.of(
                new String[]{"abc", "def","ghi"}
                ,new String[]{"ABC", "GHI","JKLMN"}
        );

        Stream<Stream<String>> streamStream = stream.map(Arrays::stream);
        Stream<String> stringStream = stream2.flatMap(Arrays::stream);
    }
}
