public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 9 and 100 are:");

        // Loop through numbers from 9 to 100
        for (int i = 9; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
