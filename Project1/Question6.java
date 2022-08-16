package Project1;
//Write a program to swap 2 numbers without a temporary variable?
public class Question6 {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);

        a=a+b;// cost of a now it 30
        b=a-b; // cost of b now it 10
        a=30;
        b=10;
        a=a-b;
        a=20;
        System.out.println(a);
        System.out.println(b);









    }

}
