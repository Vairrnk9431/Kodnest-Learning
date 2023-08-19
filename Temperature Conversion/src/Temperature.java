import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int choice= scan.nextInt();
		
		
		if(choice==1) {
			System.out.println("Enter the temperature in Celsius:");
			double celsius = scan.nextDouble();
			double fahrenheit = celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equivalent to"+fahrenheit+"°F");
		}
		
		else if(choice==2) {
			System.out.println("Enter the temperature in Fahrenheit:");
			double fahrenheit = scan.nextDouble();
			double celsius = fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"°F is equivalent to"+celsius+"°C");
		}
		

	}
	
	public static double  celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}

}
