import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		String result = isPrime(num);
		System.out.println(result);

	}
	public static String isPrime(int num) {
		
		if(num<=1) {
			return "Not prime";
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return "Not prime";
			}
				
			
		}
		 return "Prime";
	}
}   
