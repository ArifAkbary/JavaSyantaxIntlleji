package Class7;

import java.util.Scanner;

public class HWdiscount {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Is this item is for sale?  answer with yes or no ");
		String ans=scan.next();
		

		
		if(ans.equalsIgnoreCase("yes")) {
			System.out.println("Which product do you wish to purches? ");
			String ans1=scan.next();
			
			System.out.println("How much is the cost of this item? ");
			int num=scan.nextInt();
			
			if(num<20) {
				System.out.println(" the iteam which is " +num+" after discount of 10% cost reduce to" +num*10/100);
				
			}else if(num>=20 && num<=100) {
				System.out.println(" the iteam which is " +num+" after discount of 20% cost reduce to" +num*20/100);
			}else if(num>=101 && num <=500) {
				System.out.println(" the iteam which is " +num+" after discount of 30% cost reduce to" +num*30/100);
			}else {
				System.out.println(" the iteam which is " +num+" after discount of 50% cost reduce to" +num*50/100);
			}
		}

				
	}

}
