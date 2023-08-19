import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        swapUsingBitwise(first, second);


    }

    public static void swapUsingBitwise(int first, int second) {
       
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
    	
    	
    	int temp = first;
    	 first = second;
    	 second = temp;
    	
        System.out.println("After swapping: First = " + first + ", Second = " + second);
        
    }
}
