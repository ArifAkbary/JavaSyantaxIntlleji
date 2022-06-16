package Class15;

public class Task5 {
    //Create a method createEmail(). Based on values of users name,
   // lastName and email type, your method should return complete
   // email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String completeEmile(String firstName, String lastName, String emilType){
        return firstName+lastName+"@"+emilType+".com";
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        System.out.println(task5.completeEmile("Arif","Akbary","Yahoo"));
    }


}
