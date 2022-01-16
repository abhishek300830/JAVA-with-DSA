package Exercises.Excercise_1;
import java.util.Scanner;
// Write a function that takes in the radius as input and returns the circumference of a circle.
public class Question_4 {
    public static float returnCircumference(int r){
        float cir=(float) (2*3.14*r);
        return cir;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r=scan.nextInt();
        scan.close();
        float circumference=returnCircumference(r);
        System.out.print("Greatest Number is :"+circumference);
    }
}
