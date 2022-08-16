package class11;

public class DogEx {
	
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	 // how to object behave.
	
	void bark() {
		System.out.println("Dog barks");
		
	}
	
	void eat() {
		System.out.println("Dog like to eat meat");
		
	}
	public static void main (String []args) {
	
	DogEx jemmy=new DogEx();
	
	jemmy.age=2;
	jemmy.breed="amircan";
	jemmy.height=21.9;
	jemmy.weight=53;
	
	jemmy.bark();
	jemmy.eat();
	
     System.out.println(jemmy.age);
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
