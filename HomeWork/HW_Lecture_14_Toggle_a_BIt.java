package HomeWork;
import java.util.Scanner;
// Write a program to toggle a bit a position = “pos” in a number “n”.


public class HW_Lecture_14_Toggle_a_BIt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println("Enter the Position You want to Toggle :");
        System.out.println("Make Sure To enter a Valid Position ...");
        int pos=sc.nextInt();
        sc.close();
        int bitMask=1<<pos;
        int bitAtPos=(bitMask&n)==0?0:1;
        if(bitAtPos==0){
            int newN=bitMask | n;
            System.out.println("the Bit at Position is Zero");
            System.out.println("New Number is : "+newN);
        }
        else if(bitAtPos==1){
            int notBitMast=~bitMask;
            int newN=notBitMast&n;
            System.out.println("The Bit at Position is one");
            System.out.println("New Number is : "+newN);
        }
        else{
            System.out.println("Invalid");
        }

    }
}
