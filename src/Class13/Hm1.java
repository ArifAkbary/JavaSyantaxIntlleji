package Class13;

public class Hm1 {

	public static void main(String[] args) {
		
		//How would you reverse a String word by word? for example
				// input=>This is sentence i want to reverse
				// output=>sihT si ecnetnes i tnaw ot
		
		//
		
		int count =0;
		String str="This is sentence i want to reverse ";
		// let find the length;
		
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)== ' ' || i==str.length()-1) {
				for(int j=i; j>=count;j--) {
					System.out.print(str.charAt(j));
					
				}
		      count=i;
		      
		}
		
				
			}
		}
		
		
	}


