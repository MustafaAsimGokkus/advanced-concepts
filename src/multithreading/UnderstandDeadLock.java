package multithreading;
// Synchronization locks a variable as well.In this class synchronization is used
public class UnderstandDeadLock {
    public static void main(String[] args) {
      String lock1 = "lock1";
      String lock2 = "lock2";

      Thread thread1 = new Thread(new Runnable() {
          @Override
          public void run() {
              synchronized (lock1){ //synchronized process locks the process as well
                  System.out.println("Inside thread1 and locked lock1");
                  synchronized (lock2){
                      System.out.println("Inside thread1 and locked lock2");
                  }
              }
          }
      });
     thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){ //synchronized process locks the process as well
                    System.out.println("Inside thread2 and locked lock2");
                    synchronized (lock1){
                        System.out.println("Inside thread2 and locked lock1");
                    }

                }
            }
        }
        );
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("I completed the execution of threads");
    }
}
