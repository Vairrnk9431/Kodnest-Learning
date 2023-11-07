import java.util.Scanner;

public class Array_1d_Marks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]arr=new int[5];
		
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter the marks");
		arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
