package Class23;

public class Task1 {
    public static void main(String[] args) {
        degree d=new degree();
        d.getPrequetes();

        Bachlors B=new Bachlors();
        B.getPrequetes();

        Master m=new Master();
        m.getprequists();
    }

    //Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.
}
class degree{


    void getPrequetes(){
        System.out.println("to get a degree you need shcool diplma");



    }


}
class Bachlors extends degree{

}
class Master extends degree{

    void getprequists(){
        System.out.println("to get a master degree you need bachlor degree ");
    }
}

