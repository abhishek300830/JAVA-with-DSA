package HomeWork;
import java.util.Scanner;

//Write a program to count the number of 1’s in a binary representation
//of the number
public class HW_Lecture_14_Count_1s_in_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value of N: ");
        int n=sc.nextInt();
        sc.close();
        String Binary=Integer.toBinaryString(n);
        int oneCounter=0;
        for (int i = 0; i < Binary.length(); i++) {
            if(Binary.charAt(i)=='1'){
                oneCounter++;
            }
        }
        System.out.println("Binary of Number is : "+Binary);
        System.out.println("Number of 1's in Binary of Given Number is : "+oneCounter);
        
    }
}
