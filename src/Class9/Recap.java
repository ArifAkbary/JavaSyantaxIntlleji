package Class9;

public class Recap {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");// 5 times Hello.
			
			
			for(int y=1;y>=3; y++) {
				System.out.println("Bye");// no result
				
				
				
				
				
			}
		}
		System.out.println("=================");
		
		for(int i=1; i<=3; i++) {
			System.out.println("Kabul");
			
		    for(int j=1; j<=3; j++) {
		    	System.out.println("Bye");// infinite
		    }
		}
		System.out.println("==================");
		
		for(int x=5; x<=10; x++) {
			System.out.println("hello "+x);
			
			for(int z=5; z<=10; z++) {
				System.out.println("hello"+x);
				break;
			}
		
		}
		System.out.println("=================");
		
		for(int i =1; i<=5; i++) {
			System.out.println("HELLOO");
			for( int y=1; y<=3; y++) {
				System.out.println("Bye");
				continue;
			}
		}
		
		

	}

}
