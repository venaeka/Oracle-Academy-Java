
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Memasukkan ukuran ruangan
        System.out.print("Enter room height (feet): ");
        double height = input.nextDouble();

        System.out.print("Enter room length (feet): ");
        double length = input.nextDouble();

        System.out.print("Enter room width (feet): ");
        double width = input.nextDouble();

        // Memeriksa ukuran ruangan
        if (height <= 0 || length <= 0 || width <= 0) {
            System.out.println("Invalid room dimensions.");
            input.close();
            return;
        }

        // Menghitung luas empat dinding
        double wallArea = 2 * height * (length + width);

        // Menghitung luas langit-langit
        double ceilingArea = length * width;

        // Menghitung total luas yang dicat
        double totalArea = wallArea + ceilingArea;

        // Menghitung kebutuhan cat dalam satuan 1 liter
        int units = (int) Math.ceil(totalArea / 300.0);

        // Menentukan kombinasi cat paling ekonomis
        int largeBuckets = units / 5;
        int smallCans = units % 5;

        // Jika sisa 4 kaleng kecil, lebih murah membeli 1 ember besar
        if (smallCans == 4) {
            largeBuckets++;
            smallCans = 0;
        }

        // Menghitung total biaya
        double totalCost = (largeBuckets * 15) + (smallCans * 4);

        // Menampilkan hasil
        System.out.println("\n===== PAINT CALCULATION =====");

        System.out.printf("Wall area: %.2f sq ft%n", wallArea);
        System.out.printf("Ceiling area: %.2f sq ft%n", ceilingArea);
        System.out.printf("Total area: %.2f sq ft%n", totalArea);

        System.out.println("\n===== PAINT PURCHASE =====");
        System.out.println("5-liter buckets: " + largeBuckets);
        System.out.println("1-liter cans: " + smallCans);

        System.out.printf("Total cost: $%.2f%n", totalCost);

        input.close();
    }
}
