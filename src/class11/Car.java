package class11;

public class Car {
 
	  // EXP 1:
	
    // we want to create a class for car ;
	
	String Modle;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int HP;
	
	void moverForward() {
		System.out.println("Moving forward");
	}
		
		
	void reverse() {
		System.out.println("Moving backWards");
		
		
	}
	
	
	public static void main (String []args) {
		
	Car bmw=new Car();
	
	bmw.Modle="V6";
	bmw.make="Germany bmw";
	bmw.color="whate";
	bmw.year=2022;
	bmw.typeOfEngine="V8";
	bmw.HP=500;
	
	System.out.println(bmw.Modle);
	bmw.moverForward();
	bmw.reverse();
	
	
	
	
	Car toyota=new Car();
	
	toyota.Modle="RAV4";
	toyota.make="toyota";
	toyota.color="red";
	toyota.year=2022;
	toyota.HP=500;
	
	
		
		
	
	
	System.out.println(toyota.color);
		
		
	toyota.moverForward();
	toyota.reverse();	
		
		
		
		
	}
	
	
	
		
	}	
		

	


