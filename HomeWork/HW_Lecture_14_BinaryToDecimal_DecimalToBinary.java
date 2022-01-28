package HomeWork;
import java.util.Scanner;
//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert
//a number from one number system to another. [BONUS]

public class HW_Lecture_14_BinaryToDecimal_DecimalToBinary {
    static String decimalToBinary(int n){
        return Integer.toBinaryString(n);
    }
    static int binaryToDecimal(String n){
        return Integer.parseInt(n,2);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello User...");
        System.out.println("For Decimal to Binary Enter 1.");
        System.out.println("For Binary To Decimal Enter 2.");
        System.out.print("Enter from Choises :");
        int Choise=Integer.parseInt(sc.nextLine());
        /* Choise=Integer.parseInt(sc.nextLine()); or 
        we have to add this 
        choise.sc.nextInt();
        sc.nextLine();
        */
        if(Choise==1){
            System.out.print("Enter the Decimal Value:");
            int n=sc.nextInt();
            String result=decimalToBinary(n);
            System.out.println("Binary Conversion is : "+result);
        }
        else if (Choise==2) {
            System.out.println("Enter the Binary String : ");
            String n=sc.nextLine();
            int result=binaryToDecimal(n);
            System.out.println("Decimal Conversion is : "+result);

        } 
        else {
            System.out.println("Invalid Choise");
        }
        sc.close();
        
    }
}
