package Concepts.Recursion.Intermediate_Level_Recursion;

import java.util.HashSet;

// important Ques in terms of placement
// print all the Unique sub sequences of the string 
public class Unique_subSequences_imp_Ques {
    public static void printSubSequences(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) { // here hashset is used to reduce copy
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(index);
        // to be choose
        printSubSequences(str, index + 1, newString + currChar, set);
        // not to be choose
        printSubSequences(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa"; // if hashset was not there the output is
        /*
         * aaa
         * aa
         * aa
         * a
         * aa
         * a
         * a
         * 
         */
        HashSet<String> set = new HashSet<>();
        printSubSequences(str, 0, "", set);
    }
}
