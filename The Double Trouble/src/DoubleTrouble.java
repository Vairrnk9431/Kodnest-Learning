
import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		System.out.println(doubleTrouble(num));
		
	}
	public static int doubleTrouble(int num) {
	return num*2;
	}
	

}
