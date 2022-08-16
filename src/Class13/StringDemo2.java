package Class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		
		
		String str="sdfjglaidlj3567869NKSOSFDJDJ56@13%&*#)(";
		
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("&", "#"));
		
		
		

	}

}
