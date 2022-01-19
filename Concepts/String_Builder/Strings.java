package Concepts.String_Builder;

public class Strings {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony Stark");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'P'); // String Builder Property to set char at given index
        System.out.println(sb);
        
        sb.insert(0, 'S'); // insert value at given index
        System.out.println(sb);

        sb.delete(0, 1); //deleting from index 0 to 1(1 is exclusive)
        System.out.println(sb);

        StringBuilder a=new StringBuilder("H");
        a.append("ello"); // add string or char at end of String Builder
        System.out.println(a);

    }
}
