package multithreading;

public class WaitInterrupt01 {

    public static double balance;

    public static void main(String[] args) {

        WaitInterrupt01 obj = new WaitInterrupt01();

        Thread thread1 = new Thread( ()->{
            obj.withdraw(800);
        });
        thread1.start();


        Thread thread2 = new Thread( ()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.deposit(2000);
            thread1.interrupt();
        });
        thread2.start();

    }
    public void withdraw(double amount){

        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                try {
                    System.out.println("Waiting for updating the balance");
                    wait();
                } catch (InterruptedException e) {
                    balance -= amount;
                    System.out.println("Withdrawal done. Current Balance: "+balance);
                }
            }
        }

    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("The amount is deposited.Current Balance: "+balance);
        }
}

