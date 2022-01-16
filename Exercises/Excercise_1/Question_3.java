package Exercises.Excercise_1;
import java.util.*;
//Write a function which takes in 2 numbers and returns the greater of those two.
public class Question_3 {
    public static int returnGreater(int a, int b){
        if(a>b){return a;}
        else{return b;}
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Value of A and B :");
        int a=scan.nextInt();
        int b=scan.nextInt();
        scan.close();
        int greater=returnGreater(a, b);
        System.out.print("Greatest Number is :"+greater);
    }
}
