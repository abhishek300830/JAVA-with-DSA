package Concepts.Recursion.Simple_Recursion;

// Print Numbers from 5 to 1 using Recursion

public class Simple_Example {
    public static void printName(int n){
        if(n==0)
            return;
        System.out.println(n);
        printName(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printName(n);
    }
}
