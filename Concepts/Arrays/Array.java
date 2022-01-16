package Concepts.Arrays;
import java.util.Scanner;
/* take an array as input from the user search for the given Number x and print the index
at which it occurs */
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size=sc.nextInt(); 
        System.out.println();
        int array[]=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter "+(i+1)+" Element of Array : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the Number you Want to Find :");
        int x=sc.nextInt();
        sc.close();
        boolean a=false;
        for (int j = 0; j < size; j++) {
            if(x==array[j]){
                System.out.println("Element Found at index "+j);
                a=true;
            }
        }
        if(a==false){
            System.out.println("Element Not Found in the Array");
        }

    }
}
