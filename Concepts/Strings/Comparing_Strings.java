package Concepts.Strings;

public class Comparing_Strings {
    public static void main(String[] args) {
        String x="Abhi";
        String y="Abhi";
        // if s1 > s2 returns a +ve value
        // if s1 == s2 returns zero
        // if s1 <s2 returns a -ve value

        // while Comparing two strings always use compareto function because == failed in some conditions
        if(x.compareTo(y)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
