package Class10;

public class MoreExample {

	public static void main(String[] args) {
		int[][]numbers= {
			{1,2,3,5,6,7},
			{5,6,7,8},
			{5,7,9,0}
			
		};
		for(int[]num:numbers) {
			for(int n:num) {
				System.out.print(n+" ");
			}
			System.out.println();
			
		}
		for(int i=0;i<numbers.length; i++) {
			for(int j=0; j< numbers [i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
		}
		
		}

	}


