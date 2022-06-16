package Class18;

public class Labtop {
    String make;
    String model;
    String storge;
    String memory;
    double screenSize;

    public Labtop(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Labtop(String make, String model, String storge) {
        this.make = make;
        this.model = model;
        this.storge = storge;
    }

    public Labtop(String make, String model, String storge, String memory) {
        this.make = make;
        this.model = model;
        this.storge = storge;
        this.memory = memory;
    }

    public Labtop(String make, String model, String storge, String memory, double screenSize) {
        this.make = make;
        this.model = model;
        this.storge = storge;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public static void main(String[] args) {
    Labtop Apple=new Labtop("Apple","Macbook","1024","512");

        System.out.println("my computer is "+Apple.make+ "the model is "+Apple.model+" stroge is good like "+Apple.storge+" and the rim is also good like "+ Apple.memory);

    }



}
