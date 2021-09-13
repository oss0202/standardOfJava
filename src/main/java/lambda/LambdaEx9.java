package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaEx9 {
    public static void main(String[] args) {
        MyFunction3 f = (()->{
            System.out.println("f");
        });

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

//        list.forEach(System.out::println);
        list.removeIf(x -> x%2 ==0);
        System.out.println(list);

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");

        map.forEach((k,v) -> System.out.print("{" + k + ", " + v + "},"));

    }
}
