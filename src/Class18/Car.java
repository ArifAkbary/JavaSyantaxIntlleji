package Class18;

public class Car {

    private String make;
    private String model;
    private String color;


    public  Car (String  carMake , String carModel, String carColor){

        make=carMake;
        model=carModel;
        color=carColor;



    }
    public Car(String carModel){
        model=carModel;
    }



    void printcarModel(){
        System.out.println("Model"+model);
    }
    void printInfo(){
        System.out.println("carMake " +make+"Model"+model+"color is "+color);
    }
}
