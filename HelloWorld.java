public class HelloWorld{
	public static void main(String[] agrgs) {
		
		int num = 50;
		String name = "jack";
		Float deci =9.99999f;
		boolean IsFun = true;
		char symbol = '$';
		
		//using println method
		System.out.println("Hello World, This is my first java program");
		System.out.println("Learning java is fun");
		
		//using print method
		System.out.print("The print method should be used to accept input ");
		System.out.print("Another print method\n");
		
		//using printf method
		System.out.printf("I bought %d quantity of bread%n",num);
		System.out.printf("My name is %s%n",name);
		System.out.printf("Your balance is %c%.2f%n",symbol,deci);
		System.out.printf("Is Java Fun? %b%n",IsFun);
		System.out.print("Do you enjoy learning \"Java\""); 
	}
	
}
