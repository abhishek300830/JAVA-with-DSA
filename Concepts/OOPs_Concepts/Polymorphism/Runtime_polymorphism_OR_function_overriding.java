package Concepts.OOPs_Concepts.Polymorphism;
class function_overriding{
    public void add(){
        System.out.println("Adding in first");
    }
}
class second extends function_overriding{
    public void add(){
        System.out.println("Adding in second");
    }
}
public class Runtime_polymorphism_OR_function_overriding{
    public static void main(String[] args) {
        function_overriding f=new function_overriding();
        f.add();
        second s=new second();
        s.add();
    }
}
