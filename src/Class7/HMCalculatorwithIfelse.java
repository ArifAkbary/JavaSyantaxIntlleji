package Class7;

import java.util.Scanner;

public class HMCalculatorwithIfelse {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your digite ?");
		int x=input.nextInt();
		
		System.out.println("Please choice your opreator *,/,-,+,/ ");
		char op=input.next().charAt(0);
		
		System.out.println("Please enter your secand digite?");
		int y=input.nextInt();
		
		if(op=='*') {
			System.out.println(x*y);
		}else if(op=='-') {
			System.out.println(x-y);
		}else if(op=='+') {
			System.out.println(x+y);
		}else if(op=='/') {
			System.out.println(x/y);
		}

	}

}
