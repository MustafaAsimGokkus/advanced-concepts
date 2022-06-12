package multithreading;

public class Multithreading03 {

   public static int counter=0;

    public static void main(String[] args) {
      Thread thread1 = new Thread(()->{
          Counter.count();
          System.out.println("thread1 is completed");
          });
          thread1.start();

         Thread thread2 = new Thread(()->{
            Counter.count();
            System.out.println("thread2 is completed");
         });
          thread2.start();
    }
}
class Counter{
    /*
    If you use a single data for different threads you have to synchronize the methods
    otherwise you will get different outputs in every execution. use synchronized keyword to
    achieve synchronization
     */
   synchronized public static void count(){
        for (int i = 1; i <=1000 ; i++) {
            Multithreading03.counter++;
        }
        System.out.println("Counter:"+Multithreading03.counter);
    }
}