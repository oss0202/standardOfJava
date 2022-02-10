public class LongTest {
    public static void main(String[] args) {
        firstMethodCall();
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
