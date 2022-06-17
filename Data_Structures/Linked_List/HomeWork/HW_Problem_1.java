package HomeWork;
/*. Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
Search for the number 7 & display its index. */

import java.util.LinkedList;

class HW_Problem_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("Size of Linked list is :" + list.size());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 7) {
                System.out.println("Index at Which 7 Occurs is : " + i);
            }
        }
    }
}