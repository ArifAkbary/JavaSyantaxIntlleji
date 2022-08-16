package Class13;

public class HM2 {

	public static void main(String[] args) {
		//How would you swap  2 strings without 
		//a temporary variable?
		
		String str="Ahmad jan";
		String str2="Mahmood jan";
		
		System.out.println(str.replace(str, str2));
		System.out.println(str2.replace(str2, str));
	}

}
