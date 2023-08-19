import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int marks=sc.nextInt();
		System.out.println("Welcome to bcet");
		check(marks);
		
	}
	
	public static void check(int marks) {
		if(marks>=80) {
			System.out.println("Welcome to Tech Club--");
		}
	}

}
