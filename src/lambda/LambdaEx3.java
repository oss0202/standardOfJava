package lambda;

public class LambdaEx3 {

    public static void execute(MyFunction3 f){ // 매개변수 타입 MyFunction3
        f.run();
    }

    public static MyFunction3 getMyFunction(){// 반환타입이 MyFunction3
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction3 구현
        MyFunction3 f1 = () -> System.out.println("f1.run()");

        MyFunction3 f2 = new MyFunction3() {// 익명클래스로 run() 구현
            @Override
            public void run() {// 반드시 public
                System.out.println("f2.run()");
            }
        };
        MyFunction3 f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(()-> System.out.println("run()"));

    }
}
