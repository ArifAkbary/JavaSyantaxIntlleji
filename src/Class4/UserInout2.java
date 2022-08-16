package Class4;

import java.util.Scanner;

public class UserInout2 {

	public static void main(String[] args) {
		
       Scanner scanner=new Scanner(System.in);
       
       System.out.println("Which state do live now?");
       String state=scanner.next();
       System.out.println("Which kind of car do you have");
       String car=scanner.next();
       System.out.println("What is your full name?");
       String fullName=scanner.next();
       System.out.println("what is your feverit color?");
       String color=scanner.next();
       System.out.println("How old are you?");
       int age=scanner.nextInt();
       
       
       
	}

}
