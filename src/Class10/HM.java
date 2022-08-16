package Class10;

public class HM {
public static void main(String[]args) {
	
	double []num= {2.99,3.99,4,99,5};// to print it by for each loop
	for(double x:num) {
		System.out.print(x+", ");
	}
	System.out.println();
	
	  for(int i=0; i<num.length; i++) {
		  System.out.print(num[i]+ " ");
	  } 
	System.out.println();
	
	int sum=0;
	for(int k=0; k< num.length; k++) {
		sum+=num[k];
	}
	System.out.println("sum of all elements ="+sum);
	
	
	
	
	
	
}
}
