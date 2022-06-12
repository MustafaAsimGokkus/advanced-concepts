package functionalprogramming;

import java.util.Scanner;

/*
There are 3 streams in Java
1) System.out:  It is used to send data out of the program
2) System.in :  It is used to get data into our program
3) System.err:  If any error occurs when we read data or file to handle the error
 */
public class DataStreams {
    public static void main(String[] args) {

        //System.in
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println(name);
        System.err.println(name);

        try{
            System.out.println(12/0);
        }catch(ArithmeticException e){
            System.err.println("No division by zero");
        }
    }
}
