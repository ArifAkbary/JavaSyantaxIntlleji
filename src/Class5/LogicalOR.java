package Class5;

public class LogicalOR {

	public static void main(String[] args) {
		

		// EXP1
		// Description about the class 
		// Monday and Friday --> No class
		 // Tuesday and Wednesday -> Manual testing
		//  Thursday --> Review
		//  Saturday and Sunday--> Java
		
		// or is kind of logical operator is use to form both side one is must be true.
		
		
		String day="Friday";
		
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println(" no  class ");
		}else if(day.equals("Tuesday") || day.equals("wednesday")){
			System.out.println("it  is Manual teasting ");
			
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println(" it is java day ");
		}
		 
		
		
		
		
		
	}

}
