package Class4;

import java.util.Scanner;

public class CreditCart {

	public static void main(String[] args) {
		// create a java program that will ask if user has a credit or not.
		// user dose not have a credit card then offer them.If do have one ask what
		// is balance on the card?
		//if balance is on the card is longer than 4000,tell them to pay off
		//Immediately,otherwise you can tell them that they can spend more.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Hello , do you have credit cart?");
		String answer=input.nextLine();
		if(answer.equalsIgnoreCase("yes i do have")) {
			System.out.println("What is the balance on the card?");
			int amount =input.nextInt();
			if(amount>4000) {
				System.out.println("Please  pay the amount immeditally.");
				
				
			}else {
				System.out.println("you can spend more");
			}
		}else {
			System.out.println("i am offering you a card throght our bank ");
		} 
		System.out.println("------------------------------------");
		
	}
	}


