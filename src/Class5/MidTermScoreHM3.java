package Class5;

import java.util.Scanner;

public class MidTermScoreHM3 {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores
		//(quiz, mid term, and final scores) and determine the grade 
		//based on the following rules:

        //if the average score >=90 → grade=A
         //if the average score >= 70 and <90 → grade=B
         //if the average score>=50 and <70 → grade=C
          //if the average score<50 → grade=F
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter scores for midTerm");
		int midTerm=scan.nextInt();
		
		System.out.println("Enter Scores for finalTerm ");
		int finalTerm=scan.nextInt();
		
		if(midTerm+finalTerm>=90) {
			System.out.println("Your are in grade A");
		}else if(midTerm+finalTerm>=70 && midTerm+finalTerm<90) {
			System.out.println("You are in grade B");
		}else if(midTerm+finalTerm>=50 && midTerm+finalTerm<70) {
			System.out.println("You are in grade C");
		}else if(midTerm+finalTerm<50){
			System.out.println("You ae in grade F");
			
		}
		System.out.println("-----------------------------------");
		
		
		
		
		
		
		

	}

}
