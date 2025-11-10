import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter numbers (enter -1 to stop):");

        while (true) {
            int number = scanner.nextInt();

            // Check for sentinel value
            if (number == -1) {
                break;
            }

            // Count based on value
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Display results
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        scanner.close();
    }
}