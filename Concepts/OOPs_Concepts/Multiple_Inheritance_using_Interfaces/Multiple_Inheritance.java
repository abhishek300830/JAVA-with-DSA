package Concepts.OOPs_Concepts.Multiple_Inheritance_using_Interfaces;

interface A{
    void displayA();
}
interface B{
    void displayB();
}
class c implements A,B{  // this is Multiple inheritance

    @Override
    public void displayB() {
        System.out.println("this is display B");
        
    }

    @Override
    public void displayA() {
        System.out.println("This is Display A");
        
    }
    
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        c c1 = new c();
        c1.displayA();
        c1.displayB();
    }
}
