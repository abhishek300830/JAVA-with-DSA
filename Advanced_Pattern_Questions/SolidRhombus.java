package Advanced_Pattern_Questions;
import java.util.Scanner;
/*

    *****
   *****
  *****
 *****
*****

*/
public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n= sc.nextInt();
        sc.close();
        // basic loop for rows
        for (int i = 1; i <= n; i++) {

            // loop for spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
