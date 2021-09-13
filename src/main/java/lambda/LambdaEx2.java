package lambda;

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        int big = myFunction.max(2,5);
        System.out.println("anonymous function - big : " + big);

        myFunction = (int a, int b) -> a > b ? a : b;
        myFunction = (a, b) -> a > b ? a : b;
        myFunction.max(2,5);
        System.out.println("lambda - big : " + big);
    }
}
