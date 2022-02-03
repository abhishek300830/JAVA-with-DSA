package Concepts.Recursion.Simple_Recursion;
// calculate x^n (stack height = n ) using recursion

public class Calculate_X_power_N_Using_Recursion {
    public static int calculatePower(int x,int n){
        if(x==0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        return x*calculatePower(x, n-1);
    }
    public static void main(String[] args) {
       
       int x=2;
       int n=5;
       int result=calculatePower(x, n);
       System.out.println(result); 
    }
}
