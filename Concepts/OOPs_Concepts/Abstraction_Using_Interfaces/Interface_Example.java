package Concepts.OOPs_Concepts.Abstraction_Using_Interfaces;

interface Animal{
    void walk();  
    int eye =2 ;  // it is final by default i.e. property of Interface

}
class Dog implements Animal{
    public void walk(){
        System.out.println("dog is walking");
    }
}


public class Interface_Example {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.walk();
    }
}
