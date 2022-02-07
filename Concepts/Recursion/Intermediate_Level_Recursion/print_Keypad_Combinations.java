package Concepts.Recursion.Intermediate_Level_Recursion;

public class print_Keypad_Combinations {
    public static String keypad[]={".","abc","def","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombinations(String str,int idx,String combination){
        //base condition
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        printCombinations(str, 0, "");
    }
}
