package Pattern_Problems.Pattern_Questions;
 // inverted half pyramid rotated by 180 degree
 /*

    *
   **
  ***
 ****
 
 */
public class InvertedHalfPyramidEX2 {
        public static void main(String[] args) {
            int n=4;
            for (int i = 0; i < n; i++) {       //outer loop
                for (int k = n-i; k>0;k--) {  // for loop for spaces
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {  // Inner loop
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
