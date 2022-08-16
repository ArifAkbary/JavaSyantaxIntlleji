package Class8;

public class ContinuesKeyWords {

	public static void main(String[] args) {
		 //continue - skips current execution/iteration
		// when java executes continue -> 
		// go back to the beginning of the loop, 
		// so rest of the code inside loop body
		// will be skipped/ignored 
		
		
		for(int i=1; i<=5; i++) {
			if(i==2) {
				continue;
			}
			System.out.println( i+" ");
			System.out.println("Hello");
			System.out.println("we are going to break soon");
		}
	System.out.println();
	//Print numbers from 1 to 10 except number 5 and 7
		for(int a=1; a<=10; a++) {
			if(a==5 || a==7) {
				continue;
			}
			System.out.print(a+" ");
		}
		
		
		
		
		
		
	
	}
	}
		
		

