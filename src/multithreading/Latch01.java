package multithreading;

import java.util.concurrent.CountDownLatch;

/*
if we have threads and codes in main method and if I need to run threads before other codes I will
use latch

when u use "latch" use await():makes other methods wait for thread execution
 and countDown():it counts the threads, if all the threads are executed then non thread codes start to run  methods
 countDown(0 should be used inside the run() method.
 */
public class Latch01 {
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(4);
        ThreadCreator03 thread1= new ThreadCreator03 (latch );
        ThreadCreator03 thread2= new ThreadCreator03 (latch );
        ThreadCreator03 thread3= new ThreadCreator03 (latch );
        ThreadCreator03 thread4= new ThreadCreator03 (latch );

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            latch.await(); //other codes should wait threads
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1st code in main method");
        System.out.println("2nd code in main method");

    }
}


class ThreadCreator03 extends Thread{

    public ThreadCreator03(CountDownLatch latch) {
        this.latch = latch;
    }

    private CountDownLatch latch;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" thread is running.");
        System.out.println(Thread.currentThread().getName()+" thread stopped.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("================================");
        latch.countDown();
    }
}