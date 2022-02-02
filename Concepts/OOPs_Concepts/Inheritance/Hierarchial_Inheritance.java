package Concepts.OOPs_Concepts.Inheritance;

class Shape2{
    void area(){
        System.out.print("Area is : ");
    }
}
class Triangle2 extends Shape2{
    public void area(int l ,int h){
        System.out.println(.5*h*l);
    }
}
class circle extends Shape2{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        circle c=new circle();
        c.area();
        c.area(5);
    }
}
