package HomeWork;

import java.util.Scanner;

/*
Find the maximum & minimum number in an array of integers.
[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
*/
public class HW_Lecture_10_Max_Min {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size=scan.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the Elements of Array.");
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        scan.close();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int j = 0; j < array.length; j++) {
                if(array[j]<min){
                    min=array[j];
                }
                if(array[j]>max){
                    max=array[j];
                }
        }
        System.out.println("Max value in array is : "+max);
        System.out.println("Min value in array is : "+min);
    }
}
