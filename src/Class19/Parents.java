package Class19;

public class Parents {

    String name="Misha";
    double money=100000;

}
class Child extends Parents{
    void printInfo(){
        System.out.println("My full name is khyrstans " +name);
    }

    void buyCar(){
        System.out.println("heheheh buying car papas money"+money);
    }

}
class Teaster{

    public static void main(String[] args) {
        Child child =new Child();
        child.printInfo();
        child.buyCar();





    }
}
