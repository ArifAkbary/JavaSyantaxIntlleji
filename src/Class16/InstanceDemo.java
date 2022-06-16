package Class16;

public class InstanceDemo {

    String str="Instacne";
    void changeInstanceValue(){
        str="method1 ";

    }
    void printInstanceValue(){
        System.out.println(str);

    }

    public static void main(String[] args) {
        InstanceDemo id=new InstanceDemo();
        System.out.println(id.str);
        id.printInstanceValue();
        id.changeInstanceValue();
        id.printInstanceValue();
    }
}
