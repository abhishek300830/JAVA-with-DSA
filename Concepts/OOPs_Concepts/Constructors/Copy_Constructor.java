package Concepts.OOPs_Concepts.Constructors;
class Student2{
    String name;
    int age;
    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student2(Student2 s2){
        System.out.println("This is Copy Constructor");
        this.name=s2.name;
        this.age=s2.age;
    }
    Student2(){
        System.out.println("normal Constructor");
    }
}
public class Copy_Constructor {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        s1.name="abhishek Kumar";
        s1.age=20;
        Student2 s2=new Student2(s1);
        s2.displayInfo();

    }
    
}
