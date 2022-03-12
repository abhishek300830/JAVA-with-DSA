package Concepts.ArrayList;

import java.util.Collections;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        // first param is index and second is value
        list.add(2, 99);
        System.out.println(list);

        // set element

        list.set(0, 9);
        System.out.println(list);

        // delete element

        list.remove(2); // index value passed
        System.out.println(list);

        // size of Arraylist

        int size = list.size();
        System.out.println(size);

        // loop to print list
        System.out.println("Printing ArrayList Using Loops");
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }

        // sorting of ArrayList
        System.out.println("Sorting");
        Collections.sort(list);
        System.out.println(list);

    }
}
