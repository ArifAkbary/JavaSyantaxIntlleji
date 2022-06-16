package Class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogbreed,String dogcolor,int dogAge , double dogweight){
        name=dogName;
        breed=dogbreed;
        color=dogcolor;
        age=dogAge;
        weight=dogweight;
    }


void printInfo(){

    System.out.println("Name"+ name+ "breed"+breed+"color"+color+"weight"+weight);



}

    public static void main(String[] args) {
     //   Dog dog1=new Dog();

     //   dog1.name="Lofy";
    //    dog1.breed="german";
    //    dog1.color="black";
     //   dog1.age=23;
     //   dog1.weight=12;
     //   dog1.printInfo();

     //   Dog dog2=new Dog();

      //  dog2.name="jani";
      //  dog2.breed="amircan";
      //  dog2.color="red";
      //  dog2.age=25;
      //  dog2.weight=21;
      //  dog2.printInfo();


    }








}
