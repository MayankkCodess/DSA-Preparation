import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time period (in years)
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
