package Exercises.Excercise_1;
import java.util.Scanner;
// Write a function that calculates the Greatest Common Divisor of 2 numbers.
public class Question_9_Bonus {
    public static int gcd(int a,int b){
        if(b==0){return a;}
        return gcd(b,a%b); //euclidean Algorithms
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Value of A and B ...");
       int a=sc.nextInt();
       int b=sc.nextInt();
       sc.close();
       int result=gcd(a, b);
       System.out.println("The GCD of A and B is : "+result); 
    }
}
