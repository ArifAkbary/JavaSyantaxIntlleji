package Class18;

public class ThisKeywordDemo {

    String name="Instance";
    void printName(){
        String name="local";
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeywordDemo t=new ThisKeywordDemo();
        t.printName();
    }
}
