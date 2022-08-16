package Class32;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("3");
        }catch ( java.lang.Exception E ){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }finally {
            System.out.println("it will always be executed ");
        }
        System.out.println("6");

    }
}
