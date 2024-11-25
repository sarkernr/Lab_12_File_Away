import java.util.Scanner;

public class SafeInput {

    private static Scanner scanner = new Scanner(System.in);

    // Method to read a string from the user
    public static String getString(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.trim().length() > 0) {
                return input; // Return input if it's not empty or just spaces
            } else {
                System.out.println("Input cannot be empty.");
            }
        }
    }

    // Method to read an integer from the user with a range check
    public static int getInt(String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input; // Return input if it's within the valid range
                } else {
                    System.out.println("Input must be between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid integer.");
            }
        }
    }

    // Method to read a String that should be a valid email
    public static String getEmail(String prompt) {
        String email;
        while (true) {
            System.out.print(prompt);
            email = scanner.nextLine();
            if (email.contains("@") && email.contains(".")) {
                return email; // Return if the email format seems valid
            } else {
                System.out.println("Please enter a valid email address.");
            }
        }
    }

    // Method to read a string and ensure it's a 6-digit ID number (e.g., 000001, 000002)
    public static String getID(String prompt) {
        String id;
        while (true) {
            System.out.print(prompt);
            id = scanner.nextLine();
            if (id.matches("\\d{6}")) {
                return id; // Return if it's a 6-digit number
            } else {
                System.out.println("ID must be a 6-digit number.");
            }
        }
    }
}