
import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isArmstrongNumber(number)) 
            {
            System.out.println(number + " is an Armstrong number.");
            }
        else
            {
            System.out.println(number + " is not an Armstrong number.");
            }
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0;
        originalNumber = num;

        // Calculate the number of digits
        int numDigits = String.valueOf(num).length();

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numDigits);
            originalNumber /= 10;
        }

        // Check if num is equal to the sum of its digits raised to the power of numDigits
        return num == result;
    }
}