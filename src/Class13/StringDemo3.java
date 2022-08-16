package Class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		
		String str="sk8djfkdJKMLk35738djf0kdjfkdjj!@#((&,.";
		System.out.println(str);
		
		System.out.println(str.replaceAll("[0-9]","#"));
		
		System.out.println(str.replaceAll("[a-z]", "#"));
		
		System.out.println(str.replaceAll("[A-Z]", "&"));
		
                                         // REP   //INS
	System.out.println(str.replaceAll("[a-z]","*"));
	
	str="abcdefghijklmnopqrstuvwxyz";
	
	System.out.println(str.replaceAll("[a-f]", "*"));
		
		
		
		
		
		
	}

}
