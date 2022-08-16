package class11;

public class phone {

	//create a Class “Phone”. Create 3 Objects of it: iPhone,
	//Pixel, Samsung with specific  attributes and behaviors.
	
	String make;
	String color;
	String screenSize;
	boolean tuch;
	int year;
	String memory;
	int pixel;
	int sim;
	
	void playmusic() {
		System.out.println("can play music all the time");
	}
	
	void filming () {
		System.out.println("can camra film for at least one hour");
	}
	
	public static void main (String []args) {
		
	// 1 iphone
		
	phone iphone=new phone();
	
	iphone.make="Apple";
	iphone.memory="128GB";
	iphone.color="whate";
	iphone.pixel=128;
	iphone.screenSize="10Inch";
	iphone.sim=2;
	iphone.tuch=true;
	iphone.year=2020;
	
	System.out.println(iphone.memory);
	iphone.playmusic();
	iphone.filming();
	System.out.println("==========");
	
	phone pixel=new phone();
	
	pixel.color="red";
	pixel.make="china";
	pixel.memory="12GB";
	pixel.screenSize="8inch";
	pixel.sim=1;
	pixel.tuch=false;
	pixel.pixel=90;
	pixel.year=2012;
	
	
	
	System.out.println(pixel.memory);

	pixel.filming();
	pixel.playmusic();
	
	System.out.println("============");
	
	//3
	
	phone samsung=new phone();
	
	samsung.color="black";
	samsung.make="samsunge";
	samsung.memory="89GB";
	samsung.pixel=99;
	samsung.screenSize="13INCH";
	samsung.sim=3;
	samsung.tuch=true;
	samsung.year=2021;
	
	System.out.println(samsung.color);
	
	samsung.filming();
	samsung.playmusic();
	
	System.out.println("=========");
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
