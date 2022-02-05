package Concepts.Recursion.Intermediate_Level_Recursion;

public class Tower_of_Hanoi {
    public static void towerOfHanoi(int n,String src,String help,String Dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+src+" to "+ Dest);
            return;
        }
        towerOfHanoi(n-1, src, Dest, help);
        System.out.println("Transfer Disk "+n+" from "+src+" to "+Dest);
        towerOfHanoi(n-1, help, src, Dest);
    }
    public static void main(String[] args) {
        int n=5;  // n= no of disks 
        towerOfHanoi(n, "Source", "Helper", "Destination");

    }
}
