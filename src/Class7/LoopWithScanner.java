package Class7;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main (String[]args) {
		
		// we are going to ask you if you get a job
		// we will counties asking if you get a job until you say yes
		// once you say yes we will say congratulation!
		
		Scanner scan=new Scanner(System.in);
		String job;
		do {
		System.out.println("did you a job");
		job=scan.next();
		
		}while(!job.equalsIgnoreCase("Yes"));
		
		System.out.println("congrualtion");
		
		
	
	
	
	}
	
	
	
	
	}
	
	
	
	
	

