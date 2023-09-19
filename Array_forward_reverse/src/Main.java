import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter length of Array");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++){
		 arr[i]=scan.nextInt();	
	   }
		
		Printarray printarray=new Printarray();
		printarray.printforward(arr);
		printarray.printreverse(arr);

	}

}
