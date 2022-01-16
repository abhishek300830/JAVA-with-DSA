package HomeWork;

//Program to check wheather the given number is PRIME or not

import java.util.Scanner;

public class HW_Lecture_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        sc.close();
        int m=n/2;
        Boolean flag=true;
        if(n==0 || n==1 ){
            System.out.println("Not Prime");
        }
        else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("Not Prime");
                    flag=false; 
                    break;
                }

            }
            if(flag==true){
                System.out.println("Prime Number");
            }
        }
    }
}
