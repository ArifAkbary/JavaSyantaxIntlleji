package Class16;

public class GoogleEmplyee {

    String name;
    double salary;
    int noOfEmplyes;
     static String companyName="Google";


     void displayEmpleeInfo(){
         System.out.println("Name"+name+"Salary"+salary+"company Name"+companyName+"total emplyee"+noOfEmplyes);
     }
    public static void main(String[] args) {
GoogleEmplyee emp1=new GoogleEmplyee();
emp1.name="Arif";
emp1.salary=23000;
emp1.noOfEmplyes=1;
emp1.displayEmpleeInfo();

GoogleEmplyee em2=new GoogleEmplyee();

em2.name="Gul";
em2.salary=35000;
em2.noOfEmplyes=1;
em2.displayEmpleeInfo();






    }

}
