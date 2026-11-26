
public class Hand {
    private Card[] cards = new Card[5];
    private int cardCount = 0;

    public boolean addCard(Card card) {
        if (cardCount < cards.length) {
            cards[cardCount] = card;
            cardCount++;
            return true;
        }

        return false;
    }

    public int getPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < cardCount; i++) {
            total += cards[i].getPoints();

            if (cards[i].getName().equals("Ace")) {
                aceCount++;
            }
        }

        // Change Ace from 11 points to 1 if total exceeds 21
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void printHand() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println(cards[i]);
        }

        System.out.println("Total points: " + getPoints());
    }

    public int getCardCount() {
        return cardCount;
    }
}
