package multithreading;

public class MultiThreading06 {
    public static void main(String[] args) throws InterruptedException {
        Brackets3 bracket1 = new Brackets3();
        Brackets3 bracket2 = new Brackets3();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                bracket1.generateBrackets("thread1");
            }
            System.out.println("thread1 is completed");
        });
    thread1.start();

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                bracket2.generateBrackets("thread2");
            }
            System.out.println("thread2 is completed");
        });
        thread2.start();
       thread1.join();
       thread2.join();
    }
}

class Brackets3{
    /*
    if u use different objects in different threads sometimes you may get different outputs
    in every execution. static synchronization solves this issue. The steps are:
    a) type synchronized before access modifier
    b) create parameter for the method
    c) when you call the method use arguments

     */
    synchronized static  public void generateBrackets(String threadName){
        for (int i = 1; i <=10 ; i++) {
            if(i<=5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println("Thread executed: "+threadName);
    }
}