package Class21;

public class Task2 {

   /// Write program: Shape class has a constructor that takes the radius and has a subclass as  circle
///class. In circle class create a method to calculate the area of circle. Test your code

}
class Shape{

    double reduis;
    Shape(double reduis){
        this.reduis=reduis;
    }
}
class Circle extends Shape{
    public Circle(double reduis) {
        super(reduis);
    }
    void calculateAndPrintArea(){
        double area =Math.PI*Math.pow(reduis,2);
        System.out.println("Area"+area);

    }
}
class Tester{
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.calculateAndPrintArea();
    }
}