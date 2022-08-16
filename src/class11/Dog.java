package class11;

public class Dog {

	//Create a Dog Class and create 3 different objects of it: Husky,
	//Bulldog, Labrador  with specific  attributes and behaviors.
	
	String name;
	String breed;
	int age;
	double weight;
	double height;
	String color;
	
	
	void runing() {
		System.out.println("run for at least 30 min with no break");
	}
	
	void eating() {
		System.out.println("can eat at least 30lb meat and some other food in a day");
		
	}
	
	public static void main (String []args) {
		
		Dog Huskey=new Dog();
		
		Huskey.breed="AFRICA";
		Huskey.color="Yello";
		Huskey.height=67.8;
		Huskey.age=12;
		Huskey.weight=23;
		Huskey.eating();
		Huskey.runing();
		
		System.out.println(Huskey.weight);
		Huskey.eating();
		Huskey.runing();
		
		
		
		System.out.println("=================");
		
		Dog bulldog=new Dog();
		
		bulldog.breed="rusian";
		bulldog.color="whate";
		bulldog.name="jammy";
		bulldog.weight=24.0;
		bulldog.age=3;
		bulldog.height=39.9;
		
	
		
		System.out.println(bulldog.weight);
		
		bulldog.eating();
		bulldog.runing();
		
		System.out.println("====================");
		
		
		Dog labrador=new Dog();
		
		labrador.age=9;
		labrador.breed="mexican";
		labrador.color="Pink";
		labrador.height=51.5;
		labrador.name="JOIN";
		labrador.weight=27.9;
		
		System.out.println(labrador.name);
		
		labrador.runing();
		labrador.eating();
		
		System.out.println("=====================");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
