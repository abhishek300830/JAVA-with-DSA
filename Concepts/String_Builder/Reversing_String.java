package Concepts.String_Builder;

public class Reversing_String {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Abhishek");

        for (int i = 0; i < sb.length()/2; i++) {
            int first=i;
            int back=sb.length()-1-i;
            char f=sb.charAt(first);
            char b=sb.charAt(back);
            sb.setCharAt(first, b);
            sb.setCharAt(back, f);
        }
        System.out.println(sb);
    }
}
