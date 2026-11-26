
public class Deck {
    Card[] cardArray = new Card[52];

    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;

        for (int i = 0; i < suits; i++) {
            for (int j = 0; j < cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }

    // Shuffle the deck
    public void shuffle() {
        for (int i = cardArray.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
    }
}
