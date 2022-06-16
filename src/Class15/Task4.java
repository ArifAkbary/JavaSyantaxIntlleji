package Class15;

public class Task4 {
   // Create a method that will say Hello in different language based on the
    ///country that will passed when method is executed
    void sayHello(String country){
        String hello;
        switch (country){
            case"USA":
                hello="Hola";
                break;
            case"Rusia":
                hello="Privet";
                break;
            case"france":
                hello="benjor";
                break;
            case"Pakistan":
                hello="Aslamilko,";
                break;
            case"Indea":
                hello="Namista";
            default:
                hello="country not found";
        }
        System.out.println(hello);

    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("france");
    }


}
