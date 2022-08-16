package Class5;

import java.util.Scanner;

public class CityNameTempHM1 {

	public static void main(String[] args) {
		//Create a Java program that will ask user to input city
		//and temperature. Your program should convert Fahrenheit 
		//into celsius and print “The temperature is the city __ is __”
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the city name ");
		String city=scanner.nextLine();
		System.out.println("please enter the temperature in fahrenheit ");
		int temp=scanner.nextInt();
		
		System.out.println("the temperature in the city "+city+" is " +((temp-32)*5/9));
		
		
		
		
		System.out.println("--------------------------");
		
		

	}

}
