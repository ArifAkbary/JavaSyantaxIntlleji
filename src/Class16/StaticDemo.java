package Class16;

public class StaticDemo {

    static int noOfEmplyee=10;
    String name;


    static void method1(){
        System.out.println(noOfEmplyee);
       // System.out.println();
       // becaseu each object will be having a sperate copy of this name varible java gets
        // like Name which value to print.

    }

    void method2(){
        System.out.println(noOfEmplyee);
        System.out.println(name);

    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();

        st.name="Omid";

        StaticDemo st2=new StaticDemo();
        st2.name="Gul Agha";

    }

}
