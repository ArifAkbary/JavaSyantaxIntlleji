package Class6;

import java.util.Scanner;

public class CalculatorHM3 {

	public static void main(String[] args) {
		// Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.
		// Please complete this assignment in 2 ways: using
		// if statement and switch case.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number");

		double num1 = scan.nextDouble();
		System.out.println("Enter the 2nd number");

		double num2 = scan.nextDouble();

		System.out.println("Please select one of the Operators (+,-,/,*)");
		char operator = scan.next().charAt(0);

		if (operator == '+') {
			System.out.println("Answer: " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println("Answer: " + (num1 - num2));
		} else if (operator == '/') {
			System.out.println("Answer: " + num1 / num2);
		} else if (operator == '*') {
			System.out.println("Answer: " + num1 * num2);
		} 
		}

	}



