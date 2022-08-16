package Class7;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell me your first numbers ?");
		double a=scan.nextDouble();
		System.out.println("Please enter your secand number ?");
		double b=scan.nextDouble();
		
		System.out.println("Please choice your opreator ?");
		char op=scan.next().charAt(0);
		 
		double result=0;
		String opreator=null;
		switch(op) {
		case'*':
			result=a*b;
				break;
		case '+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'/':
			result=a/b;
			break;
		default:
			result=000;
			break;
		}
		
		System.out.println("The result of first number and secand number is " +result);
		
		

	}

}
