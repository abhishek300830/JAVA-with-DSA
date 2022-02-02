package Concepts.Sorting;

public class Insertion_Sorting {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        // insertion sort 
        // we starts with 1 we left 0 index as Sorted array
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
            
        }
        //print
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }

    }
}
