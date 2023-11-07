
import java.util.*;

public class Demo {

	public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		System.out.println("The Largest element in the array is: " + findLargestElement(arr));
	
	}

	static int findLargestElement(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
