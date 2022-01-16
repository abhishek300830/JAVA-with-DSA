package Concepts.Arrays;
import java.util.Scanner;

// Input a 2D array and print it on screen
public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row and Column of Array.");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        //input loop
        System.out.println("Enter the Values in 2D Array...");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j]=sc.nextInt();
            }
        }
        sc.close();
        // Print output
        System.out.println("Final Array is...");
        for (int k = 0; k < row; k++) {
            for (int l = 0; l < col; l++) {
                System.out.print(array[k][l]+" ");
            }
            System.out.println();
        }
    }
}
