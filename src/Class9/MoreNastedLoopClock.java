package Class9;

public class MoreNastedLoopClock {

	public static void main (String[]arsgs) {
		
		// how to create multiplication  table ;
		
		//EXP1 FOR 5
		
		for(int x=1; x<=10; x++) {
			for(int z=1; z<=10; z++) {
				System.out.println(x +"x"+z+"="+(x * z));
			}
			System.out.println("-------------------");
			
			
		}
		System.out.println("-------CLOCK-----");
		for( int hrs=0; hrs<24; hrs++) {
			for(int min=0; min<60; min++) {
			String  time;
			
			if(hrs<10 && min<10) {
				time="0"+hrs+":"+"0"+min;
			}else if(hrs<10 && min >=10) {
				time="0"+hrs+":"+min;
			}else if(hrs>=10 && min<10) {
				time=hrs+":"+"0"+min;
			}else {
				time=hrs+":"+min;
			}
			
			System.out.println(time);
			
			}
		}
		System.out.println("---------CLOCK STEP 2-----------------");
		
		for(int a=0; a<=2; a++) {
			for(int b=0; b<=0; b++) {
				if(a==2 && b==4) {
					break;
				}
				for(int c=0; c<=5; c++) {
					for(int d=0; d<=9; d++) {
						System.out.println(a+"" +b+":"+c+d);
					}
				}
			}
		}
		
		
		
		
		
	}
	
	
}
