package Concepts.OOPs_Concepts.Constructors;
class Student1{
    String name;
    int age;
    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1(String name,int age){
        System.out.println("This is Constructor");
        this.name=name;
        this.age=age;
    }
}
public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student1 s1=new Student1("abhishek", 20); // parameterized Constructor
        s1.displayInfo();
    }
}
