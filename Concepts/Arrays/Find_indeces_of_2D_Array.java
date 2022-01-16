package Concepts.Arrays;
import java.util.*;

// Take a matrix as a input from user. search for the given no in the matrix and print the indeces
// at which it occurs
public class Find_indeces_of_2D_Array {
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
        System.out.print("Enter the Number you want to find in the Arrray : ");
        int x=sc.nextInt();
        int count=1;
        sc.close();
        for (int k = 0; k < row; k++) {
            for (int l = 0; l < col; l++) {
                if(array[k][l]==x){
                    System.out.println("Element Found at index: ["+k+"] ["+l+"]");
                    count=2;
                }
            }
        }
        if(count==1){
            System.out.println("Element Not Found in The array.");
        }

    }
}
