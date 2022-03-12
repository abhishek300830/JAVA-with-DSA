package Concepts.Recursion.Advanced_Recursion;

// place tiles of size 1xm in floor of size nxm.

public class Place_Tiles_in_nxm{
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically place
        int vertically=placeTiles(n-m, m);
        // Horizontally place
        int Horizontally=placeTiles(n-1, m);
        return vertically+Horizontally;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int result=placeTiles(n, m);
        System.out.println(result);
    }
}