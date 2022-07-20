package Project2;
 //Create a Class Vehicle that would have the following fields: vehiclePrice and
 // method calculateSalePrice() which should be returning a price of the Vehicle.
        // Create 2 sub classes: Sedan and Truck. The Truck class has field
 // as weight and has its own implementation of  calculateSalePrice() method
 // in which returned price calculated as following: if weight>2000 then returned
 // price car should include 10% discount, otherwise 20% discount.
       // The Sedan class has field as length and also does it is own
 // implementation of calculateSalePrice(): if length of sedan is >20
 // feet then returned car price should include 5% discount, otherwise
 // 10% discount
public class Vehicle {
    double price;
    public void CalculateSalePrice(){
    }
}
class Sedan extends Vehicle{
 double length;

 @Override
 public void CalculateSalePrice() {
  if(length>20){
   System.out.println("You will get discount of "+(price/100)*5);
  }else {
   System.out.println("You will get discount of "+(price/100)*10);
  }

 }
}
class Truck extends Vehicle{
 double Weight;

 @Override
 public void CalculateSalePrice() {
  if(Weight>2000){
   System.out.println("You will get discount of "+(price/100)*10);
  }else{
   System.out.println("You will get discount of "+(price/100)*20);
  }

 }

 public static void main(String[] args) {

  Sedan sedan=new Sedan();
  sedan.price=20000;
  sedan.length=25;
  sedan.CalculateSalePrice();

  Truck truck=new Truck();
  truck.price=40000;
  truck.Weight=3000;
  truck.CalculateSalePrice();

 }
}
