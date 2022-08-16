package Class6;

import java.util.Scanner;

public class GardABCDHM2 {

	
	public static void main(String[] args) {

		// Allow user to enter grade (A, B, or C etc...)
		// and then provide explanation: A-Excellent, B-Good, C-Average,
		// D-Bad, any other grade --> Not Acceptable. At the end your program
		// should print which grade was entered by a user with ,,9U

		Scanner input = new Scanner(System.in);

		String rating, grade1;
		System.out.println("Enter your grade");
		String grade = input.next();

		switch (grade.toUpperCase()) {
		case "A":
			rating = "Excellent";
			break;
		case "B":
			rating = "Good";
			break;
		case "C":
			rating = "Average";
			break;
		case "D":
			rating = "Bad";
			break;
		default:
			rating = "Not acceptable";
		}
		System.out.println("You are in " + rating + " condation");

	}
}
