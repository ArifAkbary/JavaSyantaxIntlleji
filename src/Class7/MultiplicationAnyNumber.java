package Class7;

import java.util.Scanner;

public class MultiplicationAnyNumber {

	public static void main(String[] args) {
		int number,i;

		  Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number?");
		number=scan.nextInt();
		 for(i=1;i<=10; i++){
		   System.out.println(number+"*"+i+"="+(number*i));

	}

}
}