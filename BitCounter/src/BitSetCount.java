import java.util.Scanner;

public class BitSetCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = countSetBits(number);
        System.out.println("Number of set bits: " + count);
    }

    public static int countSetBits(int num) {
        int count = 0;

        while (num > 0) {
            
            if ((num & 1) == 1) {
                count++;
            }
           
            num >>= 1;
        }

        return count;
    }
}
