package Class22;

public class Task1 {
    // Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //  Rectangle
    //Square
    // Box


   static void area(double length, double width) {
        System.out.println(length * width);

    }

    static void area(double length) {
        System.out.println("Area of " + (length * length));


    }

    static void volume(double len, double wid, double hi){
        System.out.println("volume of box "+(len*wid*hi));

    }

    public static void main(String[] args) {
         area(10);
         area(10,10);
         volume(10.90,9.99,12.7);
    }

}