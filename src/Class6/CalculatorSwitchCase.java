package Class6;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// Calculator using switch case with Scanner class
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 1st number.");
		double firstNumber = scan.nextDouble();
		
		System.out.println("Please enter 2nd number.");
		double secondNumber = scan.nextDouble();
		
		System.out.println("Please select one of the operators (+,-,/,*)");
		char operator = scan.next().charAt(0);
		
		switch(operator) {
		
		case '+':
			System.out.println(firstNumber+secondNumber);
			break;
		case '-':
			System.out.println(firstNumber-secondNumber);
			break;
		case '*':
			System.out.println(firstNumber*secondNumber);
			break;
		case '/':
			System.out.println(firstNumber/secondNumber);
			break;
			default:
				System.out.println("Please select one of the operatos");
		}

	}

}
