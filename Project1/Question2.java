package Project1;

import java.util.Scanner;

// Using of a scanner to create array of counters and capital.
public class Question2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of country you want ");
        int  numCountry=scanner.nextInt();

        String[]countreis=new String[5];
        for(int i=0; i<countreis.length;i++){
            System.out.println("Tell me the country name");
            countreis[i]=scanner.next();
        }
        String capital=null;
        for(String a:countreis){
            if(a.equals("Afghanistan")){
                System.out.println("Capital is Kabul");
            } else if (a.equals("Pakistan")) {
                System.out.println("Capital is Islamabad");

            } else if (a.equals("Iran")) {
                System.out.println("Capital is Tehran");

            } else if (a.equals("UnitedState")) {
                System.out.println("Capital is WashingtonDC");

            } else if (a.equals("Tajikstan")) {
                System.out.println("Capital is Dowshanbah");

            } else if (a.equals("Farance")) {
                System.out.println("Capital is Parece");
            }else {
                System.out.println("No country found ");

            }
        }










    }
}
