import java.util.Scanner;

public class Main
{

public static void checkDiscount(double purchaseAmount)

{

// your code here
	if(purchaseAmount>100)
	{
		System.out.println("Discount Applicable");
	}
	

}

public static void main(String[] args)

{

//code here
 Scanner scan=new Scanner(System.in);
 Double purchaseAmount=scan.nextDouble();
 checkDiscount(purchaseAmount);

}

}