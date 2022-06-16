public class LL { // Linked list
    Node head; // store first node of linked list
    private int size;

    LL() {
        this.size = 0;
    }

    class Node { // basic Node Structure
        String data;
        Node next;

        Node(String data) { // constructor of node class to assign data
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) { // function to add node in front of linked list
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) { // function to add node to last of LL
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() { // print the list
        if (head == null) {
            System.out.print("This List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    // show the size oflinked list
    public void showSize() {
        System.out.println("Size of linked list is " + size);
    }

    public static void main(String[] args) { // main Function
        LL list = new LL();
        list.addFirst("Abhi");
        list.addFirst("hello");
        list.printList();
        list.addLast("Gurjar");
        list.printList();
        list.addFirst("Hii");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.showSize();
        list.addFirst("this");
        list.showSize();

    }
}
