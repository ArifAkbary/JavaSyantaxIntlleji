package Class9;

public class EnhancedLoop {

	public static void main(String[] args) {
		// advanced loop , for each loop;
		// we use for each loop if we want to print all them one time
		
		String[]colors= {"red","white","black","orange","silver","pink"};
		int sizecolors=colors.length;
		System.out.println(sizecolors);
		
		for(String a:colors) {
			System.out.print(a+" ");
		}
		System.out.println("-------------");
		
		int []numbers= {12,23,56,7,8,6,8,9,0,9};{
			int sizeNum=numbers.length;
			
			System.out.println(sizeNum);
			
			for(int allNum:numbers) {
				System.out.print(allNum);
			}
		}

	}

}
