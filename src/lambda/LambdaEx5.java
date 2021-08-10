package lambda;

public class LambdaEx5 {
    int val = 10; //LambdaEx5.this.val
    
    class Inner{
        int val = 20; //this.val
        
        void method(int i){ // void method(final int i)
            int val = 30; // final int val = 30;

            // 에러. 상수의 값을 변경할 수 없음
            // Variable used in lambda expression should be final or effectively final
//            i = 10;

            MyFunction3 f = () ->{
                System.out.println("i : " + i);
                System.out.println("val : " + val);
                System.out.println("this.val : " + ++this.val);
                System.out.println("LambdaEx5.this.val : " + ++LambdaEx5.this.val);
            };

            f.run();
        }
    }

    public static void main(String[] args) {
        LambdaEx5 lambdaEx5 = new LambdaEx5();
        LambdaEx5.Inner inner = lambdaEx5.new Inner();
        inner.method(100);
    }
}
