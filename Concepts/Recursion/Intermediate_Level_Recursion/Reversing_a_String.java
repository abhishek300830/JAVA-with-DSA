package Concepts.Recursion.Intermediate_Level_Recursion;

public class Reversing_a_String {
    public static void reverseString(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);

    }
    public static void main(String[] args) {
        String str="Abhishek Kumar";
        reverseString(str, str.length()-1);
    }
}
