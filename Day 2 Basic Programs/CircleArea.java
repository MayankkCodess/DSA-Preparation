import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: Area = π * radius^2
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the scanner
        scanner.close();
    }
}
