package Class13;

public class Recop {

	public static void main(String[] args) {
		
		String str="Bathc 13 is great but i say this to every bathc. i was kidding ";
		int len=str.length();
		
		System.out.println(str.toUpperCase());
		
		str=str.toUpperCase();
		
		System.out.println(str);
		
		str=" ";
		System.out.println(str.isEmpty());
		
		String str2="Tar       a";
		System.out.println(str2.trim());
		
		str="batch 13 is great but i say this to every batch. i was kiding ";
		System.out.println(str.contains("z"));//false
		System.out.println(str.contains("batch"));// true
		System.out.println(str.contains("ing"));// true
		
		
	
		
		
	}

}
