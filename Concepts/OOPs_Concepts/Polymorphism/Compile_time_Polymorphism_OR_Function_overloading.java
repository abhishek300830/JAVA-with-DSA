package Concepts.OOPs_Concepts.Polymorphism;
class Studentinfo{
    String name;
    int age;
    void printInfo(String name){
        System.out.println(name);
    }                               //this is function overloading same function name
                                    // but different parameters
    void printInfo(int age){
        System.out.println(age);
    }
    void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}
public class Compile_time_Polymorphism_OR_Function_overloading {
    public static void main(String[] args) {
        Studentinfo s=new Studentinfo();
        s.name="abhi";
        s.age=20;
        s.printInfo(s.name);
        s.printInfo(s.age);
        s.printInfo(s.name,s.age);
        


    }
}
