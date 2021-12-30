package Advanced_Pattern_Questions;
import java.util.Scanner;
/*

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Value of n :");
        int n= scan.nextInt();
        scan.close();
        //Upper Half pattern of Butterfly
        for (int i = 1; i <= n;i++) {
            
            // first portion of upper half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // condition for sapces between stars
            for (int j2 = 1; j2 <= 2*(n-i); j2++) {
                    System.out.print(" ");
            }

            // last portion of upper half
            for (int k = 1; k <= i; k++) {
                    System.out.print("*");
            }
            System.out.println();
        }

        // Reversing the Figure to make lower half of butterfly 
        for (int i = n; i >= 1;i--) {
            
            // first portion of lower half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces for lower half
            for (int j2 = 1; j2 <= 2*(n-i); j2++) {
                    System.out.print(" ");
            }
            
            //last portion for upper half
            for (int k = 1; k <= i; k++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
