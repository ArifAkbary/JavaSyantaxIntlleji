package Class23;

public class Parent {
    public static void eat(){
        System.out.println("i like to eat seafood");
    }
    public static void sleep(){
        System.out.println("i like to sleep");
    }
    public static void  activitly(){
        System.out.println("go to beach");

    }

}
class  Child extends Parent{

    public static void activitly(){
        System.out.println(" i am very religues");
    }

}
class ParentTester{
    public static void main(String[] args) {
        Child Karla=new Child();
        Parent.sleep();
        Child.activitly();
    }
}