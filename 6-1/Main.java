
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();

        Hand player = new Hand();
        Hand dealer = new Hand();

        int cardIndex = 0;

        // Deal two cards to the player and dealer
        for (int i = 0; i < 2; i++) {
            player.addCard(deck.cardArray[cardIndex++]);
            dealer.addCard(deck.cardArray[cardIndex++]);
        }

        System.out.println("===== BLACKJACK GAME =====");

        // Player's turn
        boolean playing = true;

        while (playing &&
               player.getPoints() < 21 &&
               player.getCardCount() < 5) {

            System.out.println("\nYour cards:");
            player.printHand();

            System.out.print("Do you want another card? (y/n): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("y")) {
                player.addCard(deck.cardArray[cardIndex++]);
            } else {
                playing = false;
            }
        }

        System.out.println("\nYour final cards:");
        player.printHand();

        // Dealer's turn
        System.out.println("\n===== DEALER'S TURN =====");

        while (dealer.getPoints() < 16 &&
               dealer.getCardCount() < 5) {
            dealer.addCard(deck.cardArray[cardIndex++]);
        }

        System.out.println("\nDealer's cards:");
        dealer.printHand();

        // Determine the winner
        int playerPoints = player.getPoints();
        int dealerPoints = dealer.getPoints();

        System.out.println("\n===== GAME RESULT =====");

        if (playerPoints > 21) {
            System.out.println("You lose! Your score exceeds 21.");
        } else if (dealerPoints > 21) {
            System.out.println("You win! Dealer exceeds 21.");
        } else if (playerPoints > dealerPoints) {
            System.out.println("You win!");
        } else if (playerPoints < dealerPoints) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }

        input.close();
    }
}
