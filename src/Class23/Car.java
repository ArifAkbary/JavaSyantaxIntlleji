package Class23;

public class Car {
    void start(){
        System.out.println("Use keys to start");
    }
    void stop(){
        System.out.println("Use break to stop");
    }
    void park(){
        System.out.println(" it can park me manually");

    }

}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("Can push b to start the car");
    }

    @Override
    void stop() {
        System.out.println("You can use auto break to stop");
    }

    @Override
    void park() {
        System.out.println("You can use ato parking ");

    }
}
class Tesla extends Car{

    @Override
    void start() {
        System.out.println("Mobile start car");
    }

    @Override
    void stop() {
        System.out.println("Use atomatic break");

    }

    @Override
    void park() {
        System.out.println("Park by it self");

    }
}
class Toyota extends  Car{

}
