import java.util.Scanner;

public class CaculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num1=scan.nextDouble();
		
		System.out.println("Enter the Second number");
		double num2=scan.nextDouble();
		
		System.out.println("Select an Operation +,-,*,/");
		char operator= scan.next().charAt(0);
		
		Calculator c1= new Calculator();
		c1.arthematicOperation(num1,num2,operator);
		
		
		
		

	}

}
