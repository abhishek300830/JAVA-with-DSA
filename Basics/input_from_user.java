//This is a Program to learn How to take Value from User.
package Basics;

import java.util.Scanner;

public class input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextInt for Number
        // nextFloat for Float values
        String name = sc.next();
        // next() will only accept first tocken of sentence.
        System.out.println(name);
        System.out.print("Now NextLine is used :");
        sc.nextLine(); // accept value from new line.
        String compname = sc.nextLine();
        // nextLine() is used to accept complete Line.
        System.out.println(compname);
        sc.close();

    }
}
