package Class6;

public class SwitchDemo {

	public static void main(String[] args) {
		char choice='m';
		
		String meaning="Yes";
		
		switch(choice) {
		case 'Y':
			meaning="Yes";
			break;
		case 'N':
			meaning="No";
			break;
		case 'M':
			meaning="Maybe";
			break;
		default:
			meaning="Unkown";
			
		}
		
		System.out.println(meaning);
		

	}

}
