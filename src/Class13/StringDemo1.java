package Class13;

public class StringDemo1 {

	public static void main(String[] args) {
		// Replace the words or latter
		String str="Batch 13 is good acctually very good";
		
		System.out.println(str.replace("good","great"));
		
		System.out.println(str.replace("g","G"));
		
		System.out.println(str.replaceFirst("g","G"));
		
	}

}
