package Concepts.Recursion.Intermediate_Level_Recursion;

public class find_Occurance {
    public static int first=-1;    
    public static int last=-1;    
    public static void findOccurance(String str,char element,int idx){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurance(str, element, idx+1);
    }

    public static void main(String[] args) {
        findOccurance("abaacdaefaah",'a', 0);
    }
}
