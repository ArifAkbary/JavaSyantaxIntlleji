package Class20;

public class SuperDemo {
    public static void main(String[] args) {
      Chair chair=new Chair();
      chair.printcolor();
    }




}
class Furniture{
    String color="black";

}
class Chair extends Furniture{
    String color="grya";
    void printcolor(){
        String color="white";
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(this.color);
    }

}
