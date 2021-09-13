package stream;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamEx11 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(1,46).distinct().limit(6);
        OptionalInt max = intStream.reduce(Integer::max);
        int result = max.getAsInt();
        System.out.println(result);
    }
}
