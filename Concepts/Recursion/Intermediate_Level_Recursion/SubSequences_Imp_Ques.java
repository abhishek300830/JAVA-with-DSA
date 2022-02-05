package Concepts.Recursion.Intermediate_Level_Recursion;
// important Ques in terms of placement
// print all the sub sequences of the string 
public class SubSequences_Imp_Ques {
    public static void printSubSequences(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        // to be choose
        printSubSequences(str, index+1, newString+currChar);
        // not to be choose
        printSubSequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        printSubSequences(str, 0, "");
    }
}
