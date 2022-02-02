package Concepts.OOPs_Concepts.Satic_keyword;

class studentDetails {
    String name;
    static String collage;
}

public class Static_Example {
    public static void main(String[] args) {
        studentDetails.collage="Chandigarh University";
        // we can directly access static variables without creating a object 
        // static variable or functions are common for all objects
        studentDetails student1=new studentDetails();
        student1.name="Abhishek";
        System.out.println(student1.name);
        
        System.out.println(studentDetails.collage); 
       //or System.out.println(student1.collage); 
    }
}
