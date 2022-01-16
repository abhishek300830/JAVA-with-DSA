package Concepts.Functions_and_Methods;
import java.util.Scanner;
public class Function_to_Find_factorial {
    public static void findFact(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        System.out.println("The Factorial of Number is : "+fact); 
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Value of Number");
       int n=scan.nextInt();
       scan.close();
        findFact(n);
       
       
    }
}
