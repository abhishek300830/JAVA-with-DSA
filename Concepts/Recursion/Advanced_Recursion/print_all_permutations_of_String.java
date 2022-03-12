package Concepts.Recursion.Advanced_Recursion;

public class print_all_permutations_of_String {
    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            // now calling function
            printPermutations(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        printPermutations(str, "");

    }
}
