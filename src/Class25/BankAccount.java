package Class25;

public class BankAccount {



    private String name;

   private String username;
    String password;
    private static double balance;
   private int age;

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.name="abdul";
        bankAccount.age=32;
        bankAccount.balance=12300.99;
        System.out.println("her name is abdul and account blance is "+balance);

    }

}

