package Class12;

public class StringDemo2 {

	public static void main(String[] args) {
		//Contention ;
		

		 String firstName="Arif";
		 String lastName="Akbary";
		 String fullName="Mohammd Arif Akbary";
		 
		 String fullName1=firstName+lastName;
		 String fullName2=firstName.concat(lastName);
		 
		 System.out.println(fullName2);
		 System.out.println(fullName1);
		 
		 
		 
		 
		 String name=" ";
		 System.out.println(name.isEmpty());
		 
	
	    String captonAmirca="ne  ver";
	    System.out.println(captonAmirca.trim());
		 
	}

}
