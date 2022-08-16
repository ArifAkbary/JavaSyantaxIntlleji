package Class6;

public class EnhancedLargesNumber {

	public static void main(String[] args) {
		
		
		int num1=200;
		int num2=200;
		int num3=23;
		
		int largest=0;
		
		if(num1>num2 && num1>num3) {
			largest=num1;
		}else if(num3>num1 && num3>num2) {
			largest=num3;
		}else if(num2>num1 && num2>num3){
			largest=num2;
		}else {
			System.out.println("are number are equals");
		}
		
		System.out.println("-------------------");
		
		
		
		

	}

}
