package Class8;

public class LoopPractice {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<6; i++) {
			System.out.print(sum+" ");
			sum+=i;
		}
		System.out.println();
		System.out.println(sum);
		
		
		
		//write a program find sum of all even and all odd numbers from 1 to 70;
		int sum1=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		
		System.out.println("Sum of all even numbers = "+ sum1);
		
		int sum2=0;
		for(int i=1; i<=70; i++) {
			if(i%2!=0) {
				sum2+=i;
			}
		}
		
		System.out.println("Sum of all odd numbers are =" +sum2);
		
		
		

	}

}
