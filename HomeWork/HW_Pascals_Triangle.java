package HomeWork;

import java.util.Scanner;

public class HW_Pascals_Triangle {
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n=sc.nextInt();
        sc.close();
        //basic loop
        HW_Pascals_Triangle g=new HW_Pascals_Triangle();
        for (int i = 0; i <n; i++) {
            // for spaces
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
 
                // nCr formula
                System.out.print(" "+ g.factorial(i) / (g.factorial(i - k) * g.factorial(k)));
            }
            System.out.println();
        }
    }
}
