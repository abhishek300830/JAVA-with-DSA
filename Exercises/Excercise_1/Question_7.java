package Exercises.Excercise_1;
import java.util.*;
// Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positiveCount=0;
        int negativeCount=0;
        int zeros=0;
       do{
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        if(a>0){positiveCount++;}
        else if(a<0){negativeCount++;}
        else{zeros++;}
        System.out.print("To continue Enter 'y' to Break Enter'n' :");
        char b=sc.next().charAt(0);
        if(b=='y'){
            continue;
        }
        else if( b=='n'){
            break;
        }
       }while(true);
       sc.close();
       System.out.println(positiveCount+" Positive Number Entered ");
       System.out.println(negativeCount+" Negative Number Entered ");
       System.out.println(zeros+" Zeros Entered ");
    }
}
