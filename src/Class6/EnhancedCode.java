package Class6;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the score you get in quiz");
		int quize=scan.nextInt();
		
		System.out.println("Enter the score you get in midTerm");
		int midTerm=scan.nextInt();
		
		System.out.println("Enter the score you get in finalTerm");
		int finalTerm=scan.nextInt();
		
		int avergeS=(quize+midTerm+finalTerm)/3;
		System.out.println("your averges score is " +avergeS);
		char grade;
		
		if(avergeS>=90) {
			grade='A';
		}else if(avergeS>=70 && avergeS <90) {
			grade='B';
		}else if(avergeS>=50 && avergeS<70) {
			grade='C';
		}else{
			grade='F';
			System.out.println("You are in grade " +grade+" student");
		}
		
		
			
		}
		
		
		
		
		
		

	}


