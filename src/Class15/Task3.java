package Class15;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.

 void printIsPalindrome(String str){

     StringBuilder sb = new StringBuilder(str);
     StringBuilder reverse = sb.reverse();

     if(str.equalsIgnoreCase(reverse.toString())){
         System.out.println(str+ " is a palindrome word");
     }else {
         System.out.println(str+ " is not a palindrome word");
     }
 }
 void palindrome (String str){
     for(int i=str.length()-1; i>=0; i--){
         System.out.print(str.charAt(i));
     }

 }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.printIsPalindrome("Dad");
        task3.printIsPalindrome(("Alidin"));
        task3.palindrome("Arif");


    }

}
