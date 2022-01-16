package Concepts.Functions_and_Methods;
import java.util.Scanner;
public class Function_to_ADD_2_no_return_sum {
    public static int CalculateSum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value of A and B ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        scan.close();
        int result = CalculateSum(a, b);
        System.out.println("The sum of A and B is "+result);
    }
}
