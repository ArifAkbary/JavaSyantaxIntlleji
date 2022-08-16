package Class12;

public class StringDemo8 {

	public static void main(String[] args) {
		//
		// if we want to print one of the word we have to tell the 
		// first index and last one 
		String str="Java is easy";
		String str2=str.substring(0,4);
		
		System.out.println(str2);
		
		System.out.println(str.substring(8,12));// easy

	}

}
