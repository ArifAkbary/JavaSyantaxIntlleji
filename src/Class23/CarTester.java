package Class23;

public class CarTester {

    public static void main(String[] args) {


      //  BMW bmw=new BMW();
       // bmw.start();
       // bmw.park();
      //  bmw.stop();

       // Tesla tesla=new Tesla();
       // tesla.start();
      //  tesla.park();
      //  tesla.stop();

       //// Car car=new Toyota();
       // car.start();
       // car.stop();
      //  car.park();

        Car []cars={new BMW(),new Tesla(),new Toyota()};// this call promarphysim ;

        for( Car c:cars){
            c.park();
            c.stop();
            c.start();
        }






    }



}
