package multithreading;

public class MultiThreading04 {
    public static void main(String[] args) {

      Brackets bracket = new Brackets();
      //bracket obj is used in multiple threads
      Thread thread1 = new Thread(()->
      {
          for (int i = 0; i < 15; i++) {
              bracket.generateBrackets();
          }
      });
      thread1.start();

      Thread thread2 = new Thread(()->
      {
          for (int i = 0; i <15 ; i++) {
              bracket.generateBrackets();
          }
      });
      thread2.start();

    }
}

class Brackets{
   synchronized public void generateBrackets(){
        for (int i = 1; i <=10 ; i++) {
           if(i<=5){
               System.out.print("[");
           }else{
               System.out.print("]");
           }
        }
        System.out.println();
    }
}