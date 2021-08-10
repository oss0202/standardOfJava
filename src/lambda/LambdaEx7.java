package lambda;
interface Calc{
    int add(int a, int b);
}

public class LambdaEx7 {
    public static void main(String[] args) {
        Calc calc = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(calc.add(1,10));
    }
}
