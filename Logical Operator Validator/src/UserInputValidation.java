import java.util.Scanner;

public class UserInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is input valid (true/false): ");
        boolean isValidInput = scanner.nextBoolean();

        System.out.print("Does input meet a certain condition (true/false): ");
        boolean meetsCondition = scanner.nextBoolean();

        if (isValidInput(isValidInput, meetsCondition)) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is not valid.");
        }
    }

    public static boolean isValidInput(boolean isValid, boolean meetsCondition) {
      
        return isValid && meetsCondition;
    }
}
