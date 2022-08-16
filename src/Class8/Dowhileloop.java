package Class8;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		
		
   // declare a secret number ;
   // you want to ask a user to guess your secret number 
   // your code should keep asking until user gets your secret number 
   // once user gets the secret number ====> you get it !
		Scanner scan=new Scanner(System.in);
		
		int secretNum=85;
		int guessedNum=0;
		
		do {
			System.out.println("guess a number ");
			guessedNum=scan.nextInt();
			
		}while(guessedNum!=secretNum);
		System.out.println("you got it ");
		}
		
		
	}
	


	
	
	
	
	
	



	


