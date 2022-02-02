package Concepts.Sorting;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2}; //N=No of elements
        // in bubble sort we run Outer Loop N-1 Times
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //print the array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
