import java.util.LinkedList;

public class LLusingFrameWork {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("List");
        System.out.println(list);
        System.out.println(list.size());
        // print using traversal
        for (String i : list) {
            System.out.print(i + " -> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
    
}
