package HomeWork;

import java.util.Scanner;

//Take an array of Strings input from the user & 
    //find the cumulative (combined) length of all those strings
public class HW_Lecture_12_String_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No of String you Want to Enter :");
        int n=sc.nextInt();
        System.out.println("Enter the Strings ...");
        String array[]=new String[n];
        int CombinedLength=0;
        for (int i = 0; i <= array.length; i++) {
            array[i]=sc.next(); 
            CombinedLength+=array[i].length();
        }
        sc.close();
        System.out.println("Cumulative Length of Strings is : "+CombinedLength);
        
    }
}
