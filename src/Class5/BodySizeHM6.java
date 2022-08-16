package Class5;

import java.util.Scanner;

public class BodySizeHM6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the person height in inch");
		int height=scan.nextInt();
		
		if(height < 60) {
			System.out.println("he is short");
			
		}else if(height >72) {
			System.out.println("he is tall");
		}else{
			System.out.println("he is medium size");
			System.out.println("---------------------");
		}
		
		
		
		

	}

}
