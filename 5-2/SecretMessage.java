
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pesan = "";

        System.out.println("=== SECRET MESSAGE ===");

        for (int i = 1; i <= 10; i++) {

            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka == 10) {
                System.out.println("Angka 10 tidak diperbolehkan!");
                i--;
                continue;
            }

            switch (angka) {
                case 1:
                    pesan += "D";
                    break;
                case 2:
                    pesan += "W";
                    break;
                case 3:
                    pesan += "E";
                    break;
                case 4:
                    pesan += "L";
                    break;
                case 5:
                    pesan += "H";
                    break;
                case 6:
                    pesan += "O";
                    break;
                case 7:
                    pesan += "R";
                    break;
                default:
                    System.out.println("Angka tidak valid!");
                    i--;
                    continue;
            }
        }

        System.out.println("\nPesan rahasia: " + pesan);

        input.close();
    }
}
