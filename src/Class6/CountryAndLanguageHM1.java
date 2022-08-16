package Class6;

import java.util.Scanner;

public class CountryAndLanguageHM1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.

		System.out.println("Enter your contry name.");
		String homeland = scan.nextLine();
  
		String language;
		switch (homeland) {
		case "Afghanistan":
			language = "Farsi";
			break;
		case "India":
			language = "Urdu";
			break;
		case "Germany":
			language = "Dutch";
			break;
		case "Pakistan":
			language = "Pashto and Urdu";
			break;
		case "United Kingdom":
			language = "Enlgish";
			break;
		case "Tajikistan":
			language = "Farsi or Tajiki";
			break;
		default:
			language = "I have no idea";
			break;

		}
		System.out.println("Probably you speak ," + language + ".");

	}
}
