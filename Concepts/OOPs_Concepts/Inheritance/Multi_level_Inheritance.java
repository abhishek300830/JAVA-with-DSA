package Concepts.OOPs_Concepts.Inheritance;

class Shape1{
    void area1(){
        System.out.print("Area is : ");
    }
}
class Triangle1 extends Shape1{
    public void area1(int l ,int h){
        System.out.println(.5*h*l);
    }
}

class EquilateralTriangle extends Triangle1{
    public void area1(int l ,int h){
        System.out.println(.5*h*l);
    }
}

public class Multi_level_Inheritance {
    public static void main(String[] args) {
        EquilateralTriangle eq=new EquilateralTriangle();
        eq.area1();
        eq.area1(5, 5);
    }
}
