
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta input dua kata atau frasa
        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = input.nextLine();

        // Menghapus spasi dan tanda baca
        kata1 = kata1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        kata2 = kata2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Mengubah String menjadi array karakter
        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        // Mengurutkan huruf
        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        // Membandingkan kedua kata
        if (Arrays.equals(huruf1, huruf2)) {
            System.out.println("Kedua kata merupakan anagram.");
        } else {
            System.out.println("Kedua kata bukan anagram.");
        }

        input.close();
    }
}
