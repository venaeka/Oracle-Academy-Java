
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[5];
        int total = 0;
        double average;

        // Input five test scores
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for test " + (i + 1) + ": ");
            scores[i] = input.nextInt();

            total += scores[i];
        }

        // Calculate average
        average = (double) total / scores.length;

        // Display scores
        System.out.println("\nTest Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + scores[i]);
        }

        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);

        input.close();
    }
}
