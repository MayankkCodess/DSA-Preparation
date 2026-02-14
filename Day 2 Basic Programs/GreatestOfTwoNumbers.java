import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the greatest number using a conditional statement
        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the scanner
        scanner.close();
    }
}
