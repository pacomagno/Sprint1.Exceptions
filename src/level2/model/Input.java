package level2.model;

import level2.exceptions.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean readBoolean(String message) {
        while (true) {
            try {
                System.out.print(message + " (Y/N): ");
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("y")) return true;
                if (input.equals("n")) return false;

                throw new InputMismatchException("Error: Invalid input. Please enter 's' for yes or 'n' for no.");
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }



public static char readChar(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException("Empty input not allowed. Please enter a character.");
                }

                if (input.length() > 1) {
                    throw new InvalidInputException("Only one character allowed.");
                }

                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Empty string not allowed.");
                    continue;
                }

                return input;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter text.");
                scanner.nextLine();
            }
        }
    }

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid byte.");
                scanner.next();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next().replace(',', '.'); // Allow both ',' and '.'
                return Float.parseFloat(input);
            } catch (NumberFormatException e) { // Catch only number format issues
                System.out.println("Error: Please enter a valid float number (e.g., 2.5 or 2,5).");
                scanner.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next().replace(',', '.'); // Consistency with float
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid double number.");
                scanner.next();
            }
        }
    }
}

