import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
		System.out.println("Enter lenth of Array");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++){
		arr[i]=scan.nextInt();
		
	   }
		
		System.out.println("Before swapping:");
		System.out.print("Arr==>");
		
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		  }
		
		
		System.out.println();
		System.out.print("Enter the first index to swap: ");
        int index1 = scan.nextInt();
        System.out.print("Enter the second index to swap: ");
        int index2 = scan.nextInt();
        
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        
	   
      System.out.println("After Swapping:");
      System.out.print("Arr==>");
	  for(int i=0;i<=arr.length-1;i++) {
	  System.out.print(arr[i]+" ");
	  
	  }
	  
	}

 }
