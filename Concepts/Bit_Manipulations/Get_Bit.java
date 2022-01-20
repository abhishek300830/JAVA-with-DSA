package Concepts.Bit_Manipulations;

public class Get_Bit { // This is used to get the bit at given position
    public static void main(String[] args) {
        int num=5; //0101
        int pos=2; //1 is at position 2 in 0101 (indexing starts from zero)
        int bitMask=1<<pos;
        if((num & bitMask)==0){
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit was One");
        }
    }
}
