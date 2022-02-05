package Concepts.Recursion.Intermediate_Level_Recursion;
// check using recursion array is in Strictly Increasing 
public class Check_Array_is_asending {
    public static boolean isSorted(int arr[],int idx){
        if(arr[idx]>arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
