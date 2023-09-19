import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the value of k");
		int k=scan.nextInt();
		System.out.println("Original array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
         System.out.println();
         rotateArray(arr, k);
         System.out.println("After rotation");
         for(int i=0;i<=arr.length-1;i++) {
        	 System.out.print(arr[i]+" ");
         }
         System.out.println();
         
	}
	 public static void rotateArray(int arr[],int k) {
		 int length=arr.length;
		 k=k%length;
		 for(int i=0;i<k;i++) {
			int temp=arr[length-1];
			for(int j=length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		 }
	 }

}
