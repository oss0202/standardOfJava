package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreamEx01 {
    /**
     * flatMap 사용해보기
     * @param strings
     * @return
     */
    public List<String> getString(String[] strings){
        List<String> words = Arrays.asList(strings);

        List<String> uniqueChars = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        return uniqueChars;
    }
}
