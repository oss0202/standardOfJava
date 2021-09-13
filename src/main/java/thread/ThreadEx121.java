package thread;

public class ThreadEx121 {
    public static void main(String[] args) {
        RunnableEx21 runnableEx21 = new RunnableEx21();
        new Thread(runnableEx21).start();
        new Thread(runnableEx21).start();

        Account account = new Account();

        new Thread(
                () ->{
            while (account.getBalance() > 0){
                    int money = (int)(Math.random() * 3 + 1) * 100;
                    account.withdraw(money);
                    System.out.println("람다로 쓰레드 실행");
                    System.out.println("balance : " + account.getBalance());
                }
            }
        ).start();
    }
}


