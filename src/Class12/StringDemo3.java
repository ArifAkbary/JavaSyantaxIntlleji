package Class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// 
		
		
		String str="Batch 13 is great";
		System.out.println(str.startsWith("Ferozen"));//false
		
		System.out.println(str.endsWith("great"));// true
		
		System.out.println(str.toLowerCase().endsWith("great"));
		
		
		
	  String name="Ahamd";
	  System.out.println(name.toUpperCase());// AHMAD
	  System.out.println(name.toLowerCase());
	  
	  
	  
	  String queray="13";
	  System.out.println(queray.contains(queray));
	  
	  System.out.println(queray.contains("is"));
	  
	  System.out.println(queray.toLowerCase().contains("batch"));
	  

	}

}
