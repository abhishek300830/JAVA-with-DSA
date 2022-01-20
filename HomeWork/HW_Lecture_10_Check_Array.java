package HomeWork;

import java.util.Scanner;

/* Take an array of numbers as input and check if it is an array sorted in
ascending order.
*/
public class HW_Lecture_10_Check_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the "+(i+1)+" Element of Array : ");
            array[i]=sc.nextInt();
        }
        sc.close();
        boolean count=true;
        for (int j = 1; j < array.length; j++) {
            if(array[j-1]>array[j]){
                count=false;
                break;
            }
            
        }
        if(count==true){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
        

    }
}
