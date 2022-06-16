package Class15;

public class VariblesDemo1 {

    String breed;// instance

    static int num=5; //static

    void printName(){
        String name="AHMAD";    // local variable
        System.out.println(name);

    }

    static void printName2(){
        String name="Local";    // local varible
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariblesDemo1 v=new VariblesDemo1();
        v.printName();
        System.out.println(VariblesDemo1.num);
        VariblesDemo1.printName2();
    }


}
