
public class FishTester {

    // Method to find the nicest fish
    public static Fish nicestFish(Fish... fish) {
        Fish temp = fish[0];

        for (int i = 1; i < fish.length; i++) {
            if (fish[i].getFriendliness() >
                temp.getFriendliness()) {
                temp = fish[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        // Create two fish
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);

        // Test nicestFish method
        Fish nicest = nicestFish(amber, james);

        System.out.println("Nicest fish: " + nicest.typeOfFish);
        System.out.println("Friendliness: "
                + nicest.getFriendliness());
    }
}
