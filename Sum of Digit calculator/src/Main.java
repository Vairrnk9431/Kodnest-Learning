import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =scan.nextInt();
		calculateSumOfDigits(n);
		
		
	}
	
	public static void calculateSumOfDigits(int n){

		int sum=0;
		while(n>0) {
			int lastdigit=n%10;
			sum=sum+lastdigit;
			n=n/10;
			
			
		}
		System.out.println(sum);
	
	}

}
