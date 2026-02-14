import java.util.Scanner;

public class AverageOfScores {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the sum and number of scores
        double sum = 0;
        int numberOfScores = 25;

        System.out.println("Enter the scores for 25 exams:");

        // Loop to input and add all the scores
        for (int i = 1; i <= numberOfScores; i++) {
            System.out.print("Enter score " + i + ": ");
            double score = scanner.nextDouble();
            sum += score;
        }

        // Calculate the average
        double average = sum / numberOfScores;

        // Display the result
        System.out.println("The average score is: " + average);

        // Close the scanner
        scanner.close();
    }
}
