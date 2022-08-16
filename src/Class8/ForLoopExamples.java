package Class8;

public class ForLoopExamples {

	public static void main(String[] args) {
		
		//EXP1
		// Print 1 to 90
		for(int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//EXP2
		//Print number from 60 to 10
		for(int i=60; i>=10; i--) {
			System.out.print(i+" ");
		}
    	System.out.println();
    	//EXP3
    	//Print number from 5 to 40 and jump in two 5
    	for(int i=5; i<=40; i+=5) {
    		System.out.print(i+" ");
    		
    	}
		System.out.println();
		
		//EXP4
		//Print odd numbers between 20 t0 50 // STEP ONE
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
         System.out.println();
         
         for(int i=31; i<=60; i++ ) {   //step two
        	 if(i%2!=0) {
        		 System.out.print(i+" ");
        	 }
         }
		System.out.println();
		
		//EXP5
		//Print even numbers form 20 to 1//step one
		
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=60; i>=30; i--) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		
		
		
		
		
		
		
       }
	}


