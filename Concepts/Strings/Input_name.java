package Concepts.Strings;
import java.util.Scanner;


public class Input_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");
        String name=sc.nextLine();
        sc.close();
        System.out.print("Your Name is : "+name);
    }
}
