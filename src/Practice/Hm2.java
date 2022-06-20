package Practice;

public class Hm2 {
   // Create a method that will take a String as a parameter and returns reversed String.
   // Method should be available to all classes within your project and accessible by class name.
    void printReverse(){
       String name="MohammadArifAkbary";
       for(int i=name.length()-1; i>=0; i--){
           System.out.print(name.charAt(i));
       }
    }
    public static void main(String[] args) {
        Hm2 rev=new Hm2();
        rev.printReverse();
    }
}
