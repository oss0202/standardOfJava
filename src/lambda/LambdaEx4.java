package lambda;

public class LambdaEx4 {
    public static void main(String[] args) {
        // 람다식을 매개변수로 전달 가능
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
    }
    public static void aMethod(MyFunction3 f){
        f.run();
    }
}
