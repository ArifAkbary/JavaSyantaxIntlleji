package Class6;

import java.util.Scanner;

public class SellWithDisclountHM4 {

	public static void main(String[] args) {
		/* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to 
		* calculate the price of the item after the discount, discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
		*/

		Scanner input=new Scanner(System.in);
		
		System.out.println("Is this item for sale? answer with yes or no ");
		String answer=input.nextLine();
		
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of this item?");
			double price=input.nextDouble();
			double discount = price/100;
			
			if(price<=20) {
				System.out.println("After discount of 10% the price of the item "
						+ "reduce from $"+ price + " to $" + (price-discount*10));
				System.out.println("your discout is $"+discount*10);
			
			}else if(price>20 && price<=100){
				System.out.println("After discount of 20% the price of the item "
						+ "reduce from $"+price+ " to $"+(price-discount*20));
				System.out.println("your discount is $"+discount*20);
			}else if(price<=500) {
				System.out.println("After discount of 30% the price of the item "
						+ "reduce from $"+price+ " to $"+(price-discount*30));
				System.out.println("your discount is $"+discount*30);
				
			}else{
				System.out.println("After discount of %50 the price of the item "
						+ "reduce from $"+price+ " to $"+(price-discount*50));
				System.out.println("your discount is $"+discount*50);
			}
			
		}
		}
		
		
		
	}


