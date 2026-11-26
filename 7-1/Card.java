
public class Card {
    private String suit;
    private String name;
    private int points;

    public Card(int n1, int n2) {
        String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] names = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
        };

        suit = suits[n1 - 1];
        name = names[n2 - 1];

        if (name.equals("Ace")) {
            points = 11;
        } else if (name.equals("Jack") ||
                   name.equals("Queen") ||
                   name.equals("King")) {
            points = 10;
        } else {
            points = Integer.parseInt(name);
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }
}
