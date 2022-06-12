package functionalprogramming;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
//        System.out.println(sum1(20));
//        System.out.println(sum2(20));
//        System.out.println(sumOfEvens(7,13));
//        System.out.println(sumOfFirst50OddIntegers());
//        System.out.println(anyPowOfThree(4));
//        System.out.println(pow(-2,3));
        System.out.println(anyPowOfAnyNum(-6,2));
//        System.out.println(factorial2(22));
    }
    //create a method to find the sum of integers from 1 to x by structured programming

    public static int sum1(int x) {
        int sum = 0;

        for (int i = 1; i < x + 1; i++) {
            sum += i;

        }
        return sum;
    }
    //create a method to find the sum of integers from 1 to x by lambda
    public static int sum2(int x){
    return IntStream.rangeClosed(1,x).sum();
    }

    //create a method to find the sum of even integers from x to y by lambda

    public static int sumOfEvens(int x,int y){
        return IntStream.rangeClosed(x,y).filter(t->t%2==0).sum();
    }

    //create a method to find the sum of first 50 odd positive integers
    public static int sumOfFirst50OddIntegers(){
        return IntStream.iterate(1,t->t+2).limit(50).sum();
    }
   // create a method to find any power of 3 by lambda
    public static OptionalInt anyPowOfThree(int x){

        return IntStream.iterate(3,t->t*3).limit(x).reduce((y,z)->z);
    }

// create a method to find any power of any number by lambda
    public static OptionalInt pow (int x, int y){
     return   IntStream.iterate(x, t->t*x).limit(y).reduce((m,n)->n);
    }
//create a method to find the any power (- or +) of any integer by using "functional programming"

    public static double anyPowOfAnyNum(int x, int y){
        int result = IntStream.iterate(y,t->t*y)
                     .limit(Math.abs(x))
                     .reduce(Integer.MIN_VALUE, (a,b)-> a>b?a:b);
        return 1.0/result;
    }


//create a method to calculate the factorial of any number
    //1way works until 12!
    public static OptionalInt factorial(int x){
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact);
    }
    //2. way works for all numbers
    public static BigInteger factorial2(int x) {
        return IntStream
                .rangeClosed(1, x)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}

