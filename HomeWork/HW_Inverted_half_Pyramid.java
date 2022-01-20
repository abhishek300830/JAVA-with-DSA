package HomeWork;

import java.util.Scanner;

/*
11111
2222
333
44
5

*/
public class HW_Inverted_half_Pyramid {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Value of N:");
       int n=sc.nextInt();
       sc.close();
       //for rows
       for (int i = 1; i<=n; i++) {
           //for colums
           for (int j = 1; j<=(n+1-i); j++) {
               System.out.print(i+" ");
           }
           System.out.println();
       }
   } 
}
