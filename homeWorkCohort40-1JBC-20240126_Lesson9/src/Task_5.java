import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome everyone!");
        String numberOfTheUser;

        do {
            System.out.println("Enter a four-digit number, please:");
            numberOfTheUser = scanner.nextLine();
        } while (!isValidNumber(numberOfTheUser));

        int number = Integer.parseInt(numberOfTheUser);

        System.out.println("You have entered: " + number);
    }

    public static boolean isValidNumber(String numberOfTheUser) {
        if (!Pattern.matches("\\d+", numberOfTheUser)) {
            System.err.println("No symbols or characters! Only just numbers");
            return false;
        }

        if (numberOfTheUser.length() != 4) {
            System.err.println("The number must only be four digit");
            return false;
        }
        int sumNumber1 = Character.getNumericValue(numberOfTheUser.charAt(0)) + Character.getNumericValue(numberOfTheUser.charAt(1));
        int sumNumber2 = Character.getNumericValue(numberOfTheUser.charAt(2)) + Character.getNumericValue(numberOfTheUser.charAt(3));

        if (sumNumber1 == sumNumber2) {
            System.out.println("You have a Lucky Ticket");
        } else {
            System.err.println("Your ticket is not a Lucky Ticket");
        }
        return true;
    }
}

