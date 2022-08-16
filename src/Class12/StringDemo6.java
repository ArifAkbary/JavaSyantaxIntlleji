package Class12;

public class StringDemo6 {

	public static void main(String[] args) {
		// 
		//  we want to know how money times 1 we have in this string ;
		
		String str="123588861137789118651197";
		int counter=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)== '8') {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
