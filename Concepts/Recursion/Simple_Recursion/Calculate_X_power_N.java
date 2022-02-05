package Concepts.Recursion.Simple_Recursion;

// calculate x^n (stack height = logn) using recursion 
/*
for even 
    x^n= x^n/2 * x^n/2

for Odd
    x^n= x^n/2 * x^n/2 * x
*/
public class Calculate_X_power_N {
    public static int calculatePower(int x,int n){
        if(x==0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        // if n is even
        if(n%2==0){
            return calculatePower(x, n/2)*calculatePower(x, n/2);
        }
        else{ //if n is odd
            return calculatePower(x, n/2)*calculatePower(x, n/2)*x;
        }

    }
    public static void main(String[] args) {
       
       int x=2;
       int n=5;
       int result=calculatePower(x, n);
       System.out.println(result); 
    }
}
