package Class15;

public class VariableDemo3 {


    static int num=5;
    String name;

    public static void main(String[] args) {
      VariableDemo3 v1 =new VariableDemo3();

      v1.name="Arif";

      VariableDemo3 v2=new VariableDemo3();
      v2.name="Mahmood";

      VariableDemo3 v3=new VariableDemo3();
      v3.name="Ahmad";
        System.out.println(v1.name);
        System.out.println(v2.name);
        System.out.println(v3.name);
    }
}
