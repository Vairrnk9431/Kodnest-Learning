import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchaseAmount =scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double TaxRate =scan.nextDouble();
		 
		System.out.println("Total cost including tax:"+calculateTotalWithTax( purchaseAmount,  TaxRate));
	}
	
	public static double calculateTotalWithTax(double purchaseAmount, double TaxRate) {
		double calculatedTotalCost = (purchaseAmount * TaxRate) + purchaseAmount;
		return calculatedTotalCost ;
	}

}
