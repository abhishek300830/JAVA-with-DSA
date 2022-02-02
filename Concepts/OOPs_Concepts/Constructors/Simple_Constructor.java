package Concepts.OOPs_Concepts.Constructors;

class Student{
    String name;
    int age;
    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("This is Constructor");
    }
}
public class Simple_Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="abhi";
        s1.age=19;
        s1.displayInfo();

    }
}
