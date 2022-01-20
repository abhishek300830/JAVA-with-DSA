package Concepts.Bit_Manipulations;

import java.util.Scanner;

public class Update_Bit { // used to update the bit at a Given Position (1 to 0 or 0 to 1)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 or 1");
        int toMake=sc.nextInt();
        sc.close();
        int num=5; //0101
        int pos=1; // 1st position is update according to value entered by user
        int bitMask=1<<pos; 
        if(toMake==1){
            int newNum=bitMask | num;
            System.out.println(newNum);
        }
        else if(toMake==0){
            int notBitMask=~(bitMask);
            int newNum=notBitMask & num;
            System.out.println(newNum);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
