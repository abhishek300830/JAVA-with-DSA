package Concepts.Recursion.Intermediate_Level_Recursion;
// Remove Duplicates from the String using Recursion
public class Remove_Duplicates_in_String {
    public static boolean map[]=new boolean[26];
    public static void removeDuplicate(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true){
            removeDuplicate(str, idx+1, newString);
        }else{
            newString+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abbccdda";
        removeDuplicate(str, 0, "");
    }
}
