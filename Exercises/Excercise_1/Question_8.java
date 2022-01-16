package Exercises.Excercise_1;
import java.util.Scanner;
// Two numbers are entered by the user, x and n. Write a function to find
// the value of one number raised to the power of another x^n
public class Question_8 {
    public static void findPower(int x ,int n){
        double result=Math.pow(x, n);
        System.out.println("The Value of x^n is : "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Finding x^n \n\tEnter the Value of X:");
        int x=sc.nextInt();
        System.out.print("\tEnter the Value of N : ");
        int n=sc.nextInt();
        sc.close();
        findPower(x, n);
    }
}
