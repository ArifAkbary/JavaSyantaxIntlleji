package Practice;
public class Hm3 {
    //Create a method that will accept a String as a parameter and return
   // a new String that consist only of vowels. Method should be available
  //  inside the class only where it was declared and executed by calling it is name.
   private void vowels(){
       String vowels="Syntax technology bootcoms located in virgina ";

       System.out.println(vowels.replaceAll("[^a,o,,e,i,u]",""));
    }

    public static void main(String[] args) {
        Hm3 printonlyvowelsletters=new Hm3();
        printonlyvowelsletters.vowels();
    }

}
