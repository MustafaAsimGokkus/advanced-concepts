package multithreading;

public class MultiThreading01 {
    public static void main(String[] args) throws InterruptedException {

        long startingTime01= System.currentTimeMillis();
        CounterWithoutMultiThread counter1= new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2= new CounterWithoutMultiThread(2);

        counter1.countMe();
        System.out.println("=================");
        counter2.countMe();
        long endingTime01= System.currentTimeMillis();
        System.out.println("Total duration without threading in miliseconds:"+(endingTime01-startingTime01));

        long startingTime02= System.currentTimeMillis();
        CounterWithMultiThread counter3= new CounterWithMultiThread(3);
        CounterWithMultiThread counter4= new CounterWithMultiThread(4);

        counter3.start();
        System.out.println("=================================================================");
        counter4.start();
   //     Thread.sleep(5000);//to make java wait for printing the duration of execution sleep()
   //     can be used but it is not a good practice. Instead we can use join() method.
        counter3.join();//join(): complete tasks in multithreading then run other codes
        counter4.join();

        long endingTime02= System.currentTimeMillis();
        System.out.println("Total duration with multithreading in miliseconds:"+(endingTime02-startingTime02));
    }
}
class CounterWithoutMultiThread{
    private int threadNum;

    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }
    public void countMe(){
       for(int i=1;i<9; i++){
           try{
               Thread.sleep(500);
               System.out.println("i="+i+" Thread number:"+threadNum);
           }catch (InterruptedException e){
               e.printStackTrace();
          }
       }
    }
}
class CounterWithMultiThread extends Thread {
    private int threadNum;

    CounterWithMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }
    public void countMe() {
        for (int i = 1; i < 9; i++) {
                try{
                    Thread.sleep(500);
                   System.out.println("i="+i+" Thread number:"+threadNum);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
        }
    }
    public void run(){
        countMe();
    }
}

