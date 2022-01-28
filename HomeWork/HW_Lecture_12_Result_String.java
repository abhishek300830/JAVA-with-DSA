package HomeWork;
import java.util.Scanner;
/*
. Input a string from the user. Create a new string called ‘result’ in which you will
replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
*/
public class HW_Lecture_12_Result_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String :");
        String s=sc.next();
        String result="";
        sc.close();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='e'){
                result+='i';
            }
            else{
                result+=s.charAt(i);
            }
        }
        System.out.println("\nFinal Answer is : "+result);

    }
}
