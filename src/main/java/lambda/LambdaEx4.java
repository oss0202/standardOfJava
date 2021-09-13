package lambda;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

public class LambdaEx4 {
    public static void main(String[] args) {
        // 람다식을 매개변수로 전달 가능
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));
        LambdaEx4.aMethod(()-> System.out.println("aMethod"));

        LambdaEx4.aMethod(new MyFunction3() {
            @Override
            public void run() {
                System.out.println("LambdaEx4.run");
            }
        });

        LambdaEx4.bMethod(()-> System.out.println("aMethod"));


        LambdaEx4.aMethod(new MyFunction3() {
            @Override
            public void run() {

            }
        });
    }
    public static void aMethod(MyFunction3 f){
        f.run();
    }

    public static void bMethod(MyFunction3 f){
        f.run();
    }
}
