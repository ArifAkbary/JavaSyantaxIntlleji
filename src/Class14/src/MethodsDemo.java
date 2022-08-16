package Class14.src;

import java.util.Scanner;

public class MethodsDemo {

    void printHello(){
        System.out.println("how are you guys doing ");
    }

    boolean returnTrue(){
        return true;
    }

    int returnInt(){
        return 10;
    }

    public static void main(String[] args) {

    MethodsDemo md=new MethodsDemo();
    md.printHello();

        Scanner scanner=new Scanner(System.in);
        int xs=scanner.nextInt();

    boolean x=md.returnTrue();
    int num=md.returnInt();
        System.out.println(md.returnInt());







    }



}
