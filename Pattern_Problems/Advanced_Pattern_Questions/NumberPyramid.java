package Pattern_Problems.Advanced_Pattern_Questions;
import java.util.Scanner;
/*

    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N (from 1 to 9) : ");
        int n=sc.nextInt();
        sc.close();
        // main loop for row
        for (int i = 1; i <=n; i++) {
            //for loop for spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            // for loop for Numbers
            for (int k = 1; k <=i; k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}
