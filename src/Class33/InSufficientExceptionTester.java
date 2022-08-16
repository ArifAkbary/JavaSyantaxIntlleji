package Class33;

public class InSufficientExceptionTester {
    public static void main(String[] args) {


        double balance=100;
        double transferAmount=200;
        if(transferAmount>balance){
           // System.out.println("insufficient found");
            throw new InSufficientFonds("insufficient found");

        }else {
            System.out.println("founds transferred");
        }





    }
}
