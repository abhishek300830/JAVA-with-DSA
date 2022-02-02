package Concepts.OOPs_Concepts;
class pen{
    String color;
    String type; // ball or gel
    public void Write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}
public class Classes_and_objects {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.color="blue";
        p1.type="gel";
        p1.Write();
        pen p2=new pen();
        p2.color="red";
        p1.printColor();
        p2.printColor();
    }
}
