package Class12;

public class StringDemo5 {

	public static void main(String[] args) {
	
		String str="Sammer is gulbadan and samer is sher badan";
		//System.out.println(str.charAt(2));
		//System.out.println(str.charAt(5));
		
		// find that how money letter are here in the sentence 
		
		//for(int i=0; i<str.length(); i++) {
			//System.out.print(str.charAt(i));
		
		// how can find the letter how money time repeat;
		int counter=0;
		for(int i=0; i<str.length();i ++) {
			if('s'==str.charAt(i) || 'S' ==str.charAt(i) ||'a' ==str.charAt(i)|| 'A' ==str.charAt(i ));
			counter++;
			
		}
		System.out.println("s and a apeard "+counter+  " times in this string");
	}	
	

}