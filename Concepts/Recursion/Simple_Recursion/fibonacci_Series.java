package Concepts.Recursion.Simple_Recursion;

public class fibonacci_Series {
    public static void printFibonaaci(int a , int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        n--;
        printFibonaaci(b, c, n);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        if(n>=2){
            System.out.print(a+" ");
            System.out.print(b+" ");
            printFibonaaci(a, b, n-2);  //n-2 because 2 value (a and b are already printed)
        }

        
    }
}
