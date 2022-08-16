package Class5;

import java.util.Scanner;

public class WhichMonthBornHM5 {

	public static void main(String[] args) {
		//Write a program for user to enter his/hers birth month.
		//Based on the month define the season.
		//Example: if user is born in March, April, May → season =“Spring”
		//if user is born in June, July, August →
		//season =“Summer” etc …
		//At the end of the program we should see output as “You were born is season ______“.
		
	
		Scanner  input=new Scanner(System.in);
		System.out.println("which month is your birth");
		String month=input.next();
		
		if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You born in spring season");
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("Aguest")) {
			System.out.println("You are born in summer season");
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("You born in fall season");
		}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("You born in wenter season");
			
		}
		System.out.println("--------------------------------");
		}
		
		
		
		
		
		
		}
		
		
		
	
	
	

 
