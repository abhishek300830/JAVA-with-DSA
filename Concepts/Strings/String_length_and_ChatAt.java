package Concepts.Strings;

public class String_length_and_ChatAt {
    public static void main(String[] args) {
        String name="Abhishek";
        String fullName="Abhishek Kumar"; // it also calculate Spaces
        System.out.println(name.length());
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(1)); // charAt call the character at a given index
    }
}
