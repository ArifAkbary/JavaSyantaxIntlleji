package Class7;

public class WhiLoopExamples {

	public static void main(String[] args) {
       // EXP1
		//print numbers from 1 up to 10
		
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		
		for(int num1 = 1; num <= 10; num++) {
			System.out.println(num + " ");
		}
		
		
		//EXP2
		// Print numbers from 1 to 10 
		System.out.println();
		
		int num1=0;
		while(num1<10) {
			System.out.print(num1+" ");
			num1++;
		}
		
		//EXP3
		//Print numbers from 1 to 100
		System.out.println();
		
		int num2=10;
		while(num2<=100) {
			System.out.print(num2+ " ");
			num2++;
		}
		//EXP4 
		//Print numbers from 10 to 1
		System.out.println();
		
		int num3=10;
		while(num3>=1) {
			System.out.print(num3+" ");
			num3--;
		}
		//EXP5
		//Print numbers from 100 to 50
		System.out.println();
		
		int num4=100;
		while(num4>=50) {
			System.out.print(num4+" ");
			num4--;
		}
		//EXP 6
		//Print numbers from -1 to -10
		System.out.println();
		
		int num5=-1;
		while(num5>=-10) {
			System.out.print(num5+" ");
			num5--;
		}
		//EXP 7
		//Print numbers from 1 to 20 only even numbers/ step one
		System.out.println();
		int num6=2;
		while(num6<=20) {
			System.out.print(num6+" ");
			num6+=2;
		}
		//EXP 8
		//Print numbers from 1 to 20 only even numbers / step two
		System.out.println();
		
		int num7=1;
		while(num7<=40) {
			if(num7%2==0) {
				System.out.print(num7+" ");
			}
			num7++;
		}
		//EXP 9
		//Print a numbers from 100 to 1 only odd numbers/ step one
		System.out.println();
		
		int num8=100;
		while(num8>=1) {
			if(num8%2!=0) {
				System.out.print(num8+" ");
			}
			num8--;
		}
		
		//EXP 10
		//Print a numbers from 100 to 1 only odd numbers / step two
		System.out.println();
		
		int num9=9;
		while(num9<=1) {
			System.out.print(num9+" ");
			num9-=2;
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		

	}

}
