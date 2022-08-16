package Class5;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		// You are DMV representative and you need 
		//to ask customer their age. If they are 
		//18 and older you will issue a driver license to them,
		//otherwise you will offer them to get a learners permit.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell me what is your age?");
		int age =scan.nextInt();
		
		if(age>=18) {
			System.out.println("DMV will issue a driver license for you.");
		}else {
			System.out.println("you will get a permite to day ");
		}
		
		
	System.out.println("----------------------------");
		
		
		
		
		
	}

}
