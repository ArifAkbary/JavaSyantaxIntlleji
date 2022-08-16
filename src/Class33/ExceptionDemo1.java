package Class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {// once we put the inside the catch
        // we should also explain why we are getting error .
        try {
            System.out.println(10/5);
        }catch (ArithmeticException ae){
            System.out.println("your are trying to divided by zero");
        }
    }
}
