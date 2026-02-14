import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate the sum using the formula: Sum = n * (n + 1) / 2
        int sum = n * (n + 1) / 2;

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
