package Exercises.Excercise_1;

import java.util.Scanner;

// Write a function that takes in age as input and returns if that person is eligible
// to vote or not. A person of age >= 18 is eligible to vote.
public class Question_5 {
    public static void eligibility(int x) {
        if (x >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age of Person:");
        int x=scan.nextInt();
        scan.close();
        eligibility(x);
    }
}
