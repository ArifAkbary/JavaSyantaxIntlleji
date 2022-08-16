package Class7;

import java.util.Scanner;

public class WileloopScannerJob {

	public static void main(String[] args) {
	// we are going to ask if you get a job we will continusly asking 
		// get a job until you say yes!
		// once you say yes >>> congratulation .
		
		Scanner scan=new Scanner(System.in);
		String job;
		do {
			System.out.println("Did you get a job?");
			job=scan.next();
		}while(!job.equalsIgnoreCase("yes"));
		System.out.println("Congratualtion");
	
		
			
		
	}

}
