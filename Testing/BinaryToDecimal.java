package Testing;
import java.util.*;
    public class BinaryToDecimal
    {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string : ");
        String binaryString=sc.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println("The conversion of number " +binaryString+ " is : "+decimal);
        sc.close();
    }
}
