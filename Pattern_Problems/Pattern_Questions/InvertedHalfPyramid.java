package Pattern_Problems.Pattern_Questions;
//print Inverted half pyramid 
/*
******
*****
****
***
**
*
*/
public class InvertedHalfPyramid {
    public static void main(String[] args) {
       int n=10;
       for (int i = n; i > 0; i--) {
           for (int j = i; j>0 ; j--) {
               System.out.print("*");
           }
           System.out.println();
       } 
    }
}
