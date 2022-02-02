package Concepts.OOPs_Concepts.Inheritance;
/*
single level inheritance A->B
Multi level Inheritance A->B and B->C
Hierarchial Inheritance A->B and A->C
*/
class Shape{
    void area(){
        System.out.print("Area is : ");
    }
}
class Triangle extends Shape{
    public void area(int l ,int h){
        System.out.println(.5*h*l);
    }
}

public class Single_level_Inheritance {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.area();
        t.area(5, 5);
    }
}
