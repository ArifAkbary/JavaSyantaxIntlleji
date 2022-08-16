package Class6;

import java.util.Scanner;

public class FeveriteFood {

	public static void main(String[] args) {
		
		
		//let ask a user to enter the country name
		// and we can find our favorite food.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell what is your name ?");
		String countryName=scan.nextLine();
		
		String fevoriteFood;
		switch(countryName) {
		case "nelab":
		 fevoriteFood = "burger";
			break;
		case "arif":
			fevoriteFood="Kabab";
			break;
		case "sofia":
			fevoriteFood="Kofta";
			break;
		case "ameena":
			fevoriteFood="Pizza";
			break;
		default:
			fevoriteFood="I dont know";
			break;
		}
	

		System.out.println("You are name is " + countryName+" and your fevrite food is " +fevoriteFood);

	}

}
