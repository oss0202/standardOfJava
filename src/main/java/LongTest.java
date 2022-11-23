import java.util.List;

public class LongTest {
    public static void main(String[] args) {
//        InputParamVO inputParamVO1 = new InputParamVO("aaa","bbb");
//        InputParamVO inputParamVO2 = new InputParamVO("aaa", "bbb");
//        System.out.println(inputParamVO1.getParamName().equals(inputParamVO2.getParamName()));
        List<String> stringList = List.of("111","222","333","444");
        stringList.stream().filter(s -> !s.equals("111")?true:false)
                .forEach(System.out::println);

//        firstMethodCall();
    }

    private static void fourthMethodCall() {
        System.out.println("LongTest.fourthMethodCall");

    }

    private static void thirdMethodCall() {
        System.out.println("LongTest.thirdMethodCall");
        fourthMethodCall();
    }

    private static void secondMethodCall() {
        System.out.println("LongTest.secondMethodCall");
        thirdMethodCall();
    }

    private static void firstMethodCall() {
        System.out.println("LongTest.firstMethodCall");
        secondMethodCall();
    }
}
