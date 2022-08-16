package Class5;

import java.util.Scanner;

public class MoreExm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		//EXP1 
		//Write a program that 
		//will print whether it
		//is a weekend or weekday. 
		//If any day from 1-5 → output
		//“It is a weekday”, anyday from 6-7 → 
		//output “It is a weekend”, 
		//any other day → output “Invalid day”
		
		
		System.out.println("Please  enter a week day number");
		int weekNumber=scan.nextInt();
		
		if(weekNumber>=1 && weekNumber<=5) {
			System.out.println("it week day  babay");
		}else if(weekNumber>=6 && weekNumber<=7) {
			System.out.println("it weekend baby");
		}else{
			System.out.println("invalid day ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	// EXP2
		//Ask user
		//to enter a number 
		//and then define if 
		//number is small, medium or large
		//Small number is value between 1
		//and 10
		//Medium number is value between 11
		//and 100
		//Large number is value between 101
		//and 1000
	
		System.out.println("Enter a number");
		int num= scan.nextInt();
		if(num>=1 && num<=10) {
			System.out.println("number value is samll");
		}else if(num>=11 && num<=100) {
			System.out.println("value is medium");
		}else if(num>=101 && num<1000) {
			System.out.println("value is large");
		}
		
	}

}
