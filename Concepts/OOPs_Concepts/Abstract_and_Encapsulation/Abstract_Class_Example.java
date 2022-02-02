package Concepts.OOPs_Concepts.Abstract_and_Encapsulation;
/*
Abstraction can be achieved in 2 ways
1. abstract class
2. through interface (Pure Abstraction)


Abstract classes can have both abstract and non abstract methods
we cann't create object for abstract class
it can have Constructirs and static methods also
it can have final method which will force the subclasse not to change the body of the method

*/

abstract class Animal{
    abstract void walk();
    void eat(){
        System.out.println("Animal can eat");
    }
}

class Horse extends Animal{

    @Override
    void walk() {
        System.out.println("Horse can walk");   
    }
}

class Chicken extends Animal{
   
    void walk(){
        System.out.println("Chicken can walk");   
    }
}
public class Abstract_Class_Example {
   public static void main(String[] args) {
       Horse h=new Horse();
       h.walk();
       h.eat();
       Chicken c=new Chicken();
       c.walk();
   } 
}
