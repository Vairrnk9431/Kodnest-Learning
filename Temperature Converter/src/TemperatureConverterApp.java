import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
	
        Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of Fahrenheit: ");
		double fahrenheit= scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double result=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(result);
		


	}

}
