package Class23;

public class Task2 {
  //  Create a class CreditCard and define variable balance and interest.
    //  Create an instance method that will calculate interest based on the given balance.
           // Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
   // Call the method by creating an object of each of the three classes.
}
class Creditcard{
    double balance;
    double interst;

    public Creditcard(double balance, double interst) {
        this.balance = balance;
        this.interst = interst;
    }

    public void calculateInterst(){
        System.out.println("Interest will be "+(balance*interst/100));
    }
}
class Visa extends Creditcard{
    Visa(double balance, double interst){
        super(balance,interst-8);

    }
}
class AX extends Creditcard{

    public AX(double balance, double interst) {
        super(balance, interst+12);
    }

    public static void main(String[] args) {
        Creditcard creditcard=new Creditcard(100,15);
        creditcard.calculateInterst();
        Visa visa=new Visa(200,20);
        visa.calculateInterst();

        AX ax=new AX(100,15);
        ax.calculateInterst();
    }

}
