import java.util.Scanner;

public class Journey {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Speed and Time :");
		double speed= scan.nextDouble();
		double time= scan.nextDouble();
		calculateDistance( speed, time);
		System.out.println(calculateDistance( speed, time));
		
	}
	
	public static double calculateDistance(double speed, double time) {
		
		return speed*time;
	}

}
