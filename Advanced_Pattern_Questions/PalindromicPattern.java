package Advanced_Pattern_Questions;
import java.util.Scanner;
/*

    1
   212
  32123
 4321234
543212345

*/
public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        sc.close();

        // basic for loop
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j <=(n-i); j++) { 
                System.out.print(" ");
            }
            // Numbers

            for (int k = i; k >=1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <=i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
