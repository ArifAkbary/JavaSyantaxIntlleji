package Class6;

public class SwitchIntro {

	public static void main(String[] args) {
		
		// if condition based 

		int day =10;
		String weekDay;
		
		if(day==1) {
			weekDay="Monday";
		}else if(day==2) {
			weekDay="Tuesday";
		}else if(day==3) {
			weekDay="Wensday";
		}else if(day==4) {
			weekDay="Thuresday";
		}else if(day==5) {
			weekDay="Friday";
		}else if(day==6) {
			weekDay="Saturday";
		}else if(day==7) {
			weekDay="Sunday";
		}else {
			weekDay="Unkown";
		}
		System.out.println(weekDay);
		
		// now we see how the switch is work here.
		
		// switch is value based statement.
		
		switch(5) {
		
		case 1:
			weekDay="Monday";
			break;
		case 2:
			weekDay="Tuesday";
			break;
		case 3:
			weekDay="Wensday";
			break;
		case 4:
			weekDay="Thuresday";
			break;
		case 5:
			weekDay="Friday";
			break;
		case 6:
			weekDay="Saturday";
			break;
		case 7:
			weekDay="Sunday";
			break;
		default:
			weekDay="Unkown";
			
			
		}
		System.out.println(weekDay);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
