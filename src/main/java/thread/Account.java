package thread;

public class Account {
    private int balance = 1000;

    public int getBalance(){
        return this.balance;
    }

    public synchronized void withdraw(int money){// ěęłěě­
        if(balance >= money){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            balance -= money;
        }
    }
}
