package Class22;

public class Task3 {

    //Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
  //  then the message "I love programming languages" should be printed. If some String is passed to it, then
   // in place of "programming languages" the value variable should be printed. Example, if we pass "Java",
   // then "I love Java" should be printed
}
class programming {
    programming(){
        System.out.println("i love programming languages");
    }
    programming(String masg){
        System.out.println("i love "+masg);
    }

    public static void main(String[] args) {
        new programming("java");
    }
}