import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Armstrong arms1=new Armstrong();
		Armstrong theArmstrong=new Armstrong();
		boolean res=theArmstrong.isArmstrong(num);
		if(res==true){

			System.out.println("Given Number is Armstrong");

		}

		else

		{

		System.out.println("Given Number is Not Armstrong");

		}
	}

}
