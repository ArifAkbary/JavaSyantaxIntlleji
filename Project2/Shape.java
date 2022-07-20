package Project2;
//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter.
        //Create 2 classes Circle & Square that implements functionality defined in the Shape
      //  Interface. Test your code.
public interface Shape {
    void CalculteArea(double radius);
    void CalculteParameter(double length);
}
class Circle implements Shape{
    @Override
    public void CalculteArea(double radius) {
        double area=3.1415;
        System.out.println("the area of circle with the radius of "+radius+ " is ="+radius*radius*area);
    }
    @Override
    public void CalculteParameter(double radius) {
    }
}
class Squre implements Shape{

    @Override
    public void CalculteArea(double length) {

    }
    @Override
    public void CalculteParameter(double length) {
        System.out.println("the parameter of squre is with the lenght of "+length+" is = "+length*4);
    }

    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.CalculteArea(5);
        Shape squre=new Squre();
        squre.CalculteParameter(12);

    }
}
