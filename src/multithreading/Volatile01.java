package multithreading;

public class Volatile01 {
/*
if the thread is running based on a variable there is infinite loop risk. to prevent the risk
you need to use "volatile" keyword for the variable before access modifier
 */
   volatile public static int age = 0;

    public static void main(String[] args) {
     Thread thread1 = new Thread(()->{
        while(true){
            if(age == 0){
                System.out.println("thread1 is running");
            }else{
                break;
            }
        }
      });
     thread1.start();

        Thread thread2 = new Thread(()->{
            while(true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(age == 1){
                    System.out.println("age is updated");
                }else{
                    break;
                }
            }
        });
        thread2.start();


    }
}
