
import java.util.Scanner;

public class Main {

    // Create a random card
    public static Card createRandomCard() {
        int suitNumber = (int)(Math.random() * 4 + 1);
        int faceNumber = (int)(Math.random() * 13 + 1);

        return new Card(suitNumber, faceNumber);
    }

    // Display all cards and calculate total points
    public static int displayHand(Card[] hand, int cardCount) {
        int totalPoints = 0;

        System.out.println("\nYour cards:");

        for (int i = 0; i < cardCount; i++) {
            System.out.println(hand[i]);
            totalPoints += hand[i].getPoints();
        }

        System.out.println("Total points: " + totalPoints);

        return totalPoints;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] hand = new Card[5];
        int cardCount = 0;
        int totalPoints;

        // Deal the first two cards
        hand[cardCount++] = createRandomCard();
        hand[cardCount++] = createRandomCard();

        totalPoints = displayHand(hand, cardCount);

        // Ask the player to draw another card
        while (totalPoints <= 21 && cardCount < 5) {

            System.out.print("\nDo you want another card? (y/n): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("y")) {
                hand[cardCount++] = createRandomCard();

                totalPoints = displayHand(hand, cardCount);

            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("You chose to stop.");
                break;

            } else {
                System.out.println("Invalid choice. Please enter y or n.");
            }
        }

        // Display final result
        System.out.println("\n===== GAME OVER =====");

        if (totalPoints > 21) {
            System.out.println("You lose! Your points exceed 21.");
        } else if (cardCount == 5) {
            System.out.println("You have reached 5 cards.");
        } else {
            System.out.println("Final points: " + totalPoints);
        }

        input.close();
    }
}
