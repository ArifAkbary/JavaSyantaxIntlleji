package Class10;

public class Recop {

	public static void main(String[] args) {

 String []desney= {"Elsa","shrek","goofy","mulan","tom and jery"};{
	 for(int i=0; i<desney.length; i++) {
		 if(desney[i].equalsIgnoreCase("shrek")) {
			 System.out.println( desney [i] +"is my feveriute character");
		 }else {
			 System.out.println(desney[i]);
		 }
	 }
	 
	 for(String character:desney) {
		 if(character.equalsIgnoreCase("mulan")) {
			 continue;
		 }else {
			 System.out.println(character +" ");
		 }
	 }
	 
 }
		

		
		
		
	}

}
