package Concepts.Recursion.Simple_Recursion;
// print the sum of first N Natural Numbers
public class Print_Sum_of_Numbers {
    public static void printsum(int n ,int sum){ 
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        n--;
        printsum(n,sum);
        

    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        printsum(n ,sum);
    }
}
