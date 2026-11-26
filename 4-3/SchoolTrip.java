
import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta jumlah peserta
        System.out.print("Masukkan jumlah peserta: ");
        int peserta = input.nextInt();

        // Menghitung jumlah bus dan sisa peserta
        int jumlahBus = peserta / 45;
        int jumlahVan = peserta % 45;

        // Menampilkan hasil
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Jumlah orang yang naik van: " + jumlahVan);

        input.close();
    }
}
