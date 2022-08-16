package Class5;

import java.util.Scanner;

public class LoanHM2 {

	public static void main(String[] args) {
		//You are a loan specialist and you need to ask user
		//what is the amount of loan is needed. If loan is less 
		//or equal to 200,000 then you would lend the money otherwise 
		//you would reject the client.
		
		Scanner input=new Scanner(System.in);
		System.out.println("what is the amount loan is need it ?");
		double loanAmount=input.nextInt();
		
		if(loanAmount<=200000) {
			System.out.println("you will lend the money");
		}else {
			System.out.println(" your application rejected");
		}
		
		System.out.println("---------------------");
		
	}

}
