package Class23;

public  class Animal {
    void eat(){
        System.out.println("All the animal eat");
    }
}
class Panda extends Animal{

    void eat(){
        System.out.println("All the animal eat");
    }

    Panda(){
        System.out.println("Child ");
    }

    public static void main(String[] args) {
        new Panda();

    }

    // if we use finla no other class can inherte form our class


}
