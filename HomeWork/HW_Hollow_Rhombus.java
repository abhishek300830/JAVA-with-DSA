package HomeWork;

import java.util.Scanner;

public class HW_Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n=sc.nextInt();
        sc.close();
        //for loop for row
        for (int i = 1; i <=n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    if(k==1 || k==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }
    }
}
