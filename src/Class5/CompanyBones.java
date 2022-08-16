package Class5;

import java.util.Scanner;

public class CompanyBones {

	public static void main(String[] args) {
		//Write a program to ask user to enter numbers of worked years 
		//and annual salary. If user worked for more or equals to 5 years
		//than user is eligible for the bonus, otherwise he is not. Once user 
		//is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how money years you worked for the company");
		int workYear=input.nextInt();
		if(workYear>=5) {
			System.out.println("Sir, you are eligible for bonus ");
		}else {
			System.out.println("your not eligible for bonus");
		}
		
		System.out.println("Enter your annual salary");
		double salary=input.nextDouble();
		if(salary>50000) {
			System.out.println("you get 5000 bonus");
		}else {
			System.out.println("you get 3000 bonus");
		}
		
		System.out.println("------------------------------------------");
		

	}

}
