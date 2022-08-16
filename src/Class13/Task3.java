package Class13;

public class Task3 {

	public static void main(String[] args) {
		///Write a program that reads two people's first
		//names and if they expecting boy or girl? 
	//Based on the input suggests a name for a baby:
	//Example Output:
	//Mom's first name? Mary
	//Dad's first name? Daniel
	//Boy or Girl? boy
	//Suggested baby name: DANRY
		
		String father="Daniel";
		String mother="Mary";
		
		Boolean girls=false;
		
		if(girls) {
			String firsthalf=father.substring(0,father.length()/2);
			String secandhalf=mother.substring(mother.length()/2);
			System.out.println(firsthalf.trim()+secandhalf.trim());
		}else {
			String firsthalf=mother.substring(0,mother.length()/2);
			String secandhalf=father.substring(father.length()/2);
			System.out.println(firsthalf.trim()+secandhalf.trim());
		}
		

	}

}
