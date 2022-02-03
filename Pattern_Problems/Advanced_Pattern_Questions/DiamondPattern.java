package Pattern_Problems.Advanced_Pattern_Questions;
import java.util.Scanner;
/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

    */
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n=scan.nextInt();
        scan.close();

        // loop for row
        for (int i = 1; i <= n; i++) {
            //loop for spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // upper half
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("*");
            }
            // lower half
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //loop for spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // upper half
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("*");
            }
            // lower half
            System.out.println();
        }
    }
}
