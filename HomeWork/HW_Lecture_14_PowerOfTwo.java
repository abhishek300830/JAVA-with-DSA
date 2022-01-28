package HomeWork;

import java.util.Scanner;
//Write a program to find if a number is a power of 2 or not.
public class HW_Lecture_14_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of N:");
        int n=sc.nextInt();
        sc.close();
        int i=0;
        boolean count=false;
        while(Math.pow(2, i)<=n){
            if(Math.pow(2, i)==n){
                System.out.println(n+" is in Power of 2.");
                count=true;
                break;
            }
            i++;
        }
        if(count==false){
            System.out.println(n +" is Not in Power of 2.");
        }
    }
}
