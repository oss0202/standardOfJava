package thread;

import java.util.Random;

public class ThreadSample extends Thread{
    private int num;

    public ThreadSample(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        Random r = new Random(System.currentTimeMillis());
        System.out.println(num + " STARTED");
        try {
            int tm = r.nextInt(500);
            Thread.sleep(tm);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(num + " ENDED");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        for (int i = 0; i < 5; i++) {
            ThreadSample test = new ThreadSample(i);
            test.start();
        }
        System.out.println("End main");
    }
}
