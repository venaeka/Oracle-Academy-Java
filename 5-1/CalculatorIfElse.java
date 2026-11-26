import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean valid = true;

        if (operator == '+') {
            hasil = angka1 + angka2;

        } else if (operator == '-') {
            hasil = angka1 - angka2;

        } else if (operator == '*') {
            hasil = angka1 * angka2;

        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Tidak bisa dibagi nol.");
                valid = false;
            }

        } else if (operator == '%') {
            if (angka2 != 0) {
                hasil = angka1 % angka2;
            } else {
                System.out.println("Error: Tidak bisa menggunakan modulus dengan nol.");
                valid = false;
            }

        } else {
            System.out.println("Operator tidak valid.");
            valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

        input.close();
    }
}
