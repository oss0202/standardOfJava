package thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        // run()이 아닌 start()를 호출하는 이유
        // run()을 호출할 경우. 쓰레드를 실행시키는 것이 아니라 단순 메서드를 호출하는 것이다.
        t1.start();
        t2.start();

    }
}
