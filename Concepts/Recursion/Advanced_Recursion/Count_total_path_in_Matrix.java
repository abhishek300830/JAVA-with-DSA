package Concepts.Recursion.Advanced_Recursion;
//find the total path in the matrix from 0,0 to i,j 
// in which we can only move in downward or right

public class Count_total_path_in_Matrix {
    public static int countPath(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downpaths=countPath(i+1, j, n, m);
        //move right
        int rightpaths=countPath(i, j+1, n, m);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int totalpaths=countPath(0, 0, n, m);
        System.out.println(totalpaths);
    }
}
