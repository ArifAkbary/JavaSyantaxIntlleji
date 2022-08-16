package Class13;

public class Recop2 {

	public static void main(String[] args) {
		String str="Where is sammer?";
		
		// if we want to find out the char by index;
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		// if we want to find out the index of any char.
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		
		// Multiple of char
		
		System.out.println(str.indexOf("e",3));
		
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='e') {
				counter++;
				if(counter==4) {
					System.out.println(i);
				}
			}
		}
		
		
		
		
	}

}
