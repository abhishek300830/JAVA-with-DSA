package Exercises.Excercise_1;
import java.util.Scanner;
// Enter 3 numbers from the user & make a function to print their average

public class Question_1 {
    public static void calculateAvg(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println("The Average of Numbers is : "+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of A,B,C ...");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        calculateAvg(a, b, c);
    }
}
