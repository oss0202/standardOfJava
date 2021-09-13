package lambda;

@FunctionalInterface
interface MyFunction0 {
    int mul(int a);
}

@FunctionalInterface
interface MyFunctionBigNum {
    int max(int a, int b);
}

@FunctionalInterface
interface MyFunctionNameAge {
    void println(String name, int age);
}

public class LambdaEx0 {
    void MyfunctionCall(MyFunctionNameAge f, String name, int age){
        f.println(name, age);
    }
    public static void main(String[] args) {
        MyFunctionBigNum f2 = (int a, int b) -> {
            System.out.println("MyFunctionBigNum interface use");
            return a > b ? a : b;
        };
        f2 = (int a, int b) -> {return a > b ? a : b;};
        f2 = (int a, int b) -> a > b ? a : b;
        f2 = (a, b) -> a > b ? a : b;

        MyFunction0 f = (int a) -> a * a;
        f = a -> a * a;

        MyFunctionNameAge f3 = (String a, int b) -> {
            System.out.println(a + " : " + b);
        };
        f3 = (String a, int b) -> System.out.println(a + " : " + b);

        LambdaEx0 lambda = new LambdaEx0();
        lambda.MyfunctionCall(
                (name, age) -> System.out.println("name : " + name + ", age : " + age)
                , "오성식"
                ,29
        );

        MyFunctionNameAge f4 = (MyFunctionNameAge)(String a, int b) -> {
            System.out.println(a + " : " + b);
        };

    }
}
