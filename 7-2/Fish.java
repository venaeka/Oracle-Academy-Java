
public class Fish {

    String typeOfFish;
    int friendliness;

    // Constructor without parameters
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Constructor with parameters
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Method to get friendliness
    public int getFriendliness() {
        return friendliness;
    }
    public String getName() {
    return typeOfFish;
}
}
