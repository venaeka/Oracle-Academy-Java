
public class MathExpressions {
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi variabel
        double x = 2;
        double y = 2;
        double z = 10;

        double a, b, c, d, e, f;

        // Rumus a
        a = Math.sqrt(Math.pow(x, 5) - 6) / 4;

        // Rumus b
        b = Math.pow(x, y) - 6 * x;

        // Rumus c
        c = 4 * Math.cos(z / 5) - Math.sin(Math.pow(x, 2));

        // Rumus d
        d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));

        // Rumus e
        e = 1.0 / (y - 1.0 / (x - 2 * y));

        // Rumus f
        f = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4))));

        // Menampilkan hasil
        System.out.println("Hasil a = " + a);
        System.out.println("Hasil b = " + b);
        System.out.println("Hasil c = " + c);
        System.out.println("Hasil d = " + d);
        System.out.println("Hasil e = " + e);
        System.out.println("Hasil f = " + f);
    }
}
