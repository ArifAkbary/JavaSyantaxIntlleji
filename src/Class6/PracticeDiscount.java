package Class6;

import java.util.Scanner;

public class PracticeDiscount {

	public static void main(String[] args) {
		///* Write a program to ask user to enter value for sale: yes or no
		//* if there is no sale --> you are not going for shopping
		//* if there is sale ask user which item they want to buy and it’s price
		//* Based on the price you have to 
		//* calculate the price of the item after the discount, discount rule:
		//* if price is less than $20 --> apply 10%
		//* if price is between $20 & $100 --> 20%
		//* if price between $100 & $500 --> 30%
		//* otherwise apply 50% discount
		//After discount ___ the price of the item reduce from __ to ___
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("is this item is for sale?");
		String Item=scan.nextLine();
		System.out.println("how much is the price?");
		double price=scan.nextDouble();
		double discount=price/100;
		if(price<20) {
			System.out.println("after discount 10% the price of the item reduce from $"+price+"to $"+(price-discount*10) );
		}else if(price>=20 && price<=100){
			System.out.println("after discount 20% the price of the item reduce from $"+price+"to $"+(price-discount*20));
		}else if(price>=100 && price<=500) {
			System.out.println("after discount 30% the price of the item reduce from $"+price+"to $"+(price-discount*30));
		}else if(price>500){
			System.out.println("after discount 50% the price of the item reduce from $"+price+"to $"+(price-discount*50));
		}
		
		
		
		
		
		
		
		

	}
	{
		
	}
	}

