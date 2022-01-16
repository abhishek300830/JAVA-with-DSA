package Exercises.Excercise_1;
import java.util.*;
// Write a function to print the sum of all odd numbers from 1 to n.
public class Question_2 {
    public static void printSum(int n){
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                continue;
            }
            else{sum=sum+i;}    
        }
        System.out.println("The sum of All Odd Numbers from 1 to N is : "+sum);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=scan.nextInt();
        scan.close();
        printSum(n);
    }
}
