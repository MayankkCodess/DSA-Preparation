import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum number using conditional statements
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Display the maximum number
        System.out.println("The maximum of the three numbers is: " + max);

        // Close the scanner
        scanner.close();
    }
}
