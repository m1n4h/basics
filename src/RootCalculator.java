import java.util.Scanner;

public class RootCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        // Loop keeps running until the user enters 0
        while (choice != 0) {
            System.out.println("\n--- Root Calculator Menu ---");
            System.out.println("1 - Square Root");
            System.out.println("2 - Cube Root");
            System.out.println("0 - Exit");
            System.out.print("\nChoice: ");

            // Check if input is an integer to prevent crashes
            if (input.hasNextInt()) {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        double num1 = input.nextDouble();
                        System.out.println("Square root is: " + Math.sqrt(num1));
                        break;

                    case 2:
                        System.out.print("Enter a number: ");
                        double num2 = input.nextDouble();
                        System.out.println("Cube root is: " + Math.getExponent(num2)); // Alternative: Math.pow(num2, 1.0/3.0)
                        // Corrected method for cube root:
                        System.out.println("Cube root is: " + Math.cbrt(num2));
                        break;

                    case 0:
                        System.out.println("Program exited");
                        break;

                    default:
                        System.out.println("Invalid input. Please enter 0, 1, or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input
            }
        }
        input.close();
    }
}