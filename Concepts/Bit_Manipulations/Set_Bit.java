package Concepts.Bit_Manipulations;

public class Set_Bit { // this is used to set the bit to 1 to the given position
    public static void main(String[] args) {
        int num=5; // 0101 --> 0111 
        int pos=1; //position to which we have to set 1
        int bitMask=1<<pos;
         num=bitMask | num;
        System.out.println(num);
    }
}
