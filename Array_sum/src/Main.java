import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of  first array");
		int arr1[]= new int [scan.nextInt()];
		
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();			
		}
		System.out.println("Enter the length of  second array");
		int arr2[]= new int [scan.nextInt()];
		
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=scan.nextInt();			
		}
		
		int arr3[]=new int [arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.print("arr1-->");
		for(int i=0;i<=arr1.length-1;i++)
		{
		System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("arr2-->");
		for(int i=0;i<=arr2.length-1;i++)
		{
		System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.print("arr3-->");
		for(int i=0;i<=arr3.length-1;i++)
		{
		System.out.print(arr3[i]+" ");
		
		}
		

	}

}
