
import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah siswa di sekolah
        System.out.print("Jumlah siswa di sekolah: ");
        int jumlahSiswa = input.nextInt();

        // Memasukkan status peringkat siswa
        System.out.print("Valedictorian atau Salutatorian? (true/false): ");
        boolean peringkat = input.nextBoolean();

        // Memasukkan GPA
        System.out.print("Masukkan GPA: ");
        double gpa = input.nextDouble();

        // Memasukkan skor SAT
        System.out.print("Masukkan skor SAT: ");
        int sat = input.nextInt();

        // Memeriksa kriteria penerimaan
        boolean kriteria1 = peringkat && jumlahSiswa >= 1400;
        boolean kriteria2 = gpa >= 4.0 && sat >= 1100;
        boolean kriteria3 = gpa >= 3.5 && sat >= 1300;
        boolean kriteria4 = gpa >= 3.0 && sat >= 1500;

        // Menentukan hasil penerimaan
        if (kriteria1 || kriteria2 || kriteria3 || kriteria4) {
            System.out.println("SELAMAT! Anda DITERIMA di Mountville University.");
        } else {
            System.out.println("MAAF, Anda TIDAK DITERIMA di Mountville University.");
        }

        input.close();
    }
}
