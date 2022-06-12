package multithreading;

public class Multithreading05 {
    public static void main(String[] args) throws InterruptedException {

        long startingTime01= System.currentTimeMillis();
        Brackets01 bracket = new Brackets01();
        //bracket obj is used in multiple threads
        Thread thread1 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                bracket.generateBrackets();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(()->
        {
            for (int i = 0; i <5 ; i++) {
                bracket.generateBrackets();
            }
        });
        thread2.start();
        thread1.join();
        thread2.join();
        long endingTime01= System.currentTimeMillis();
    //    System.out.println("Synchronized method:"+(endingTime01-startingTime01)); //3737
        System.out.println("Synchronized block:"+(endingTime01-startingTime01)); //18971
    }
}


class Brackets01{
     public void generateBrackets(){

         synchronized (this){
         for (int i = 1; i <=10 ; i++) {
            if(i<=5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
           }
         }
        System.out.println();
 //2nd part of the method needs no synchronozation because it is just sleeping.
        for (int i=0; i<=5; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}