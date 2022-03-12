package Concepts.Recursion.Advanced_Recursion;

import java.util.ArrayList;


// print all the subsets of a set of first n natural number

public class print_subset_of_a_set {
    public static void printSubsetes(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void findsubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubsetes(subset);
            return;
        }

        //add hoga
        subset.add(n);
        findsubsets(n-1, subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        findsubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n=4;
        ArrayList<Integer> subset=new ArrayList<>();
        findsubsets(n, subset);
    }
}
