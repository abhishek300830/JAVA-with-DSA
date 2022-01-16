package HomeWork;

import java.util.Scanner;

// Take an array of names as input from the user and print them on the screen
public class HW_Lecture_10_String_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int size=scan.nextInt();
        String array[]=new String[size];
        System.out.println("Enter The Names you Want to Store in Array.");
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.next();
        }
        scan.close();
        for (int j = 0; j < array.length; j++) {
            System.out.print((j+1)+" Name in Array is : "+array[j]);
            System.out.println();
        }
    }
}
