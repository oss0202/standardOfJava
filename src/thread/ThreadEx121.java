package thread;

public class ThreadEx121 {
    public static void main(String[] args) {
        RunnableEx21 runnableEx21 = new RunnableEx21();
        new Thread(runnableEx21).start();
        new Thread(runnableEx21).start();
    }
}


