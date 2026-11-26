
package galToLit;

import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double gallons;
        double liters;

        // Meminta jumlah galon dari pengguna
        System.out.print("Enter gallons: ");
        gallons = input.nextDouble();

        // Menghitung konversi galon ke liter
        liters = gallons * 3.785;

        // Menampilkan hasil konversi
        System.out.println(gallons + " gallons equals "
                + liters + " liters");

        // Menutup Scanner
        input.close();
    }
}
