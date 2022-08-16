package Class5;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // There are three logical operator which &&, ||, !
		// the first one is &&
		// it means both side of must be true in the condition.
		
		boolean job=true;
		double salary=5000;
		
		if(job && salary>=5000) {
			System.out.println("i feel my self lucky ");
		}
		System.out.println("=================================");
		
		boolean study=true;
		boolean homework=true;
		boolean java=true;
		
		if(study && homework && java) {
			System.out.println("you become a good teaster");
		}else {
			System.out.println("go drive for uber every single day ");
		}
		System.out.println("==============================");
		
		// write a program to find the largest number by using &&
		int x=30;
		int y=10;
		int z=22;
		
		if(x>=y && x>=z) {
			System.out.println("the largest number is " + x);
		}else if(y>=z && z>=x) {
			System.out.println("the largest number is " +y );
		}else if(z>=x && z>=y) {
			System.out.println("the largest number is " +z);
			
		}
		System.out.println("======================");
		
		
		
	}

}
