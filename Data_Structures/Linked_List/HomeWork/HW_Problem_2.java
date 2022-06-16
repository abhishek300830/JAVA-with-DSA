/*Take elements(numbers in the range of 1-50) of a Linked List as input
from the user. Delete all nodes which have values greater than 25. */

import java.util.LinkedList;
import java.util.Scanner;

public class HW_Problem_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Elements you Want to Enter :");
        int n = scan.nextInt();
        System.out.println("Enter " + n + " Numbers...");
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        scan.close();
        System.out.println(list);
        System.out.println("Now ATQ All Nodes greater than 25 Should be Deleted.");
        // loop to delete Node Greater than 25
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
                i--; // this is because when Number at i is deleted the number at i++ will shift to i
                     // position
            }
        }
        System.out.println("List are Removed");
        System.out.println(list);

    }
}
