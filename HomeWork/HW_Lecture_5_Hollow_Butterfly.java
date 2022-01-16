package HomeWork;
import java.util.*;
public class HW_Lecture_5_Hollow_Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Want to Print Hollow Butterfly ...");
        System.out.print("Specify the Value of N :");
        int n=sc.nextInt();
        sc.close();

        // upper half pattern
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==1){System.out.print("*");}
                else if(j==i){System.out.print("*");}
                else{System.out.print(" ");}
            }
            for (int k = 1; k <= (2*n-2*i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                if(l==1){System.out.print("*");}
                else if(l==i){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
        // lower half pattern
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                if(j==1){System.out.print("*");}
                else if(j==i){System.out.print("*");}
                else{System.out.print(" ");}
            }
            for (int k = 1; k <= (2*n-2*i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                if(l==1){System.out.print("*");}
                else if(l==i){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
