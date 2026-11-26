
public class Card {
    private String suit;
    private String name;
    private int points;

    public Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String getSuit(int n) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        return suits[n];
    }

    public String getName(int n) {
        String[] names = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
        };
        return names[n];
    }

    public int getPoints(String name) {
        if (name.equals("Ace")) {
            return 11;
        } else if (name.equals("Jack") ||
                   name.equals("Queen") ||
                   name.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(name);
        }
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    public int getPoints() {
        return points;
    }

    public String toString() {
        return name + " of " + suit;
    }
}
