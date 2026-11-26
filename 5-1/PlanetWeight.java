
import java.util.Scanner;
import java.text.DecimalFormat;

public class PlanetWeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight on Earth (lbs): ");
        double weight = input.nextDouble();

        System.out.println("\n=== PLANET MENU ===");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");

        System.out.print("\nChoose a planet (1-7): ");
        int choice = input.nextInt();

        String planet = "";
        double factor = 0;

        switch (choice) {
            case 1:
                planet = "Mercury";
                factor = 0.38;
                break;

            case 2:
                planet = "Venus";
                factor = 0.91;
                break;

            case 3:
                planet = "Mars";
                factor = 0.38;
                break;

            case 4:
                planet = "Jupiter";
                factor = 2.36;
                break;

            case 5:
                planet = "Saturn";
                factor = 0.92;
                break;

            case 6:
                planet = "Uranus";
                factor = 0.89;
                break;

            case 7:
                planet = "Neptune";
                factor = 1.13;
                break;

            default:
                System.out.println("Invalid planet selection.");
                input.close();
                return;
        }

        double result = weight * factor;

        DecimalFormat format = new DecimalFormat("0.##");

        System.out.println("\nYour weight on " + planet +
                " is " + format.format(result) + " lbs.");

        input.close();
    }
}
