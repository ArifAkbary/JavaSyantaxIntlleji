package Project1;
//Write a Java Program to print the first
//10 numbers of Fibonacci series.

public class Question8 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        a=0;
        b=1;
    for(int i=1; i<=10; i++){
        c=a+b;
        a=b;
        b=c;

        System.out.print(a+ " , ");



    }

    }


}
