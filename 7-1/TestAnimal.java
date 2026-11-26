
public class TestAnimal {
    public static void main(String[] args) {

        // Using the default constructor
        Animal animal1 = new Animal();

        // Using the parameterized constructor
        Animal animal2 = new Animal(60, 5, 4);

        // Display the speed of each animal
        System.out.println("Animal #1 speed: " + animal1.getSpeed());
        System.out.println("Animal #2 speed: " + animal2.getSpeed());
    }
}
