package Concepts.Recursion.Simple_Recursion;

import java.util.Scanner;

public class Calculate_factorial {
    public static int calcFact(int n){
        if(n==1 || n==0 ){
            return 1;
        }
        return n*calcFact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(calcFact(n));
    }
}
