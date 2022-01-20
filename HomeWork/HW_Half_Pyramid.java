package HomeWork;

import java.util.Scanner;

public class HW_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        // for Row
        for (int i = 1; i <=n; i++) {
            // for spaces
            for (int j=i; j <n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
