package Concepts.Bit_Manipulations;

public class Clear_Bit { // this is used to set the bit to 0 of a given position
    public static void main(String[] args) {
        int num=5; //0101
        int pos=2; //position 2 that is 1 we have to convert into 0
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);
        num=notBitMask & num;
        System.out.println(num);
    }
}
