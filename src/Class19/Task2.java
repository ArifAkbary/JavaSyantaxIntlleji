package Class19;

public class Task2 {
    //Create a method that will take a String as a parameter and
    //returns reversed String. Method should be available to all classes within
   // your project and accessible by class name.

    public static  String reversedString(String str){
        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        String str="Monday";
        System.out.println(Task2.reversedString("Monday"));

    }

}
