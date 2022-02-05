package Concepts.Recursion.Intermediate_Level_Recursion;
// Move all x at the end of the string like (axbcxxd => abcdxxx)
public class Move_all_X_at_end {
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for (int i = 0; i < count; i++) {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString+=str.charAt(idx);
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
