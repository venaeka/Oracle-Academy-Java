
public class StringPractice {

    public static void main(String[] args) {

        // NOMOR 2
        System.out.println("=== NOMOR 2 ===");

        String s1 = "ABC";
        String s2 = new String("DBP");
        String s3 = "AB" + "C";

        System.out.println("a. " + s1.compareTo(s2));
        System.out.println("b. " + s2.equals(s3));
        System.out.println("c. " + (s3 == s1));
        System.out.println("d. " + s2.compareTo(s3));
        System.out.println("e. " + s3.equals(s1));


        // NOMOR 3
        System.out.println("\n=== NOMOR 3 ===");

        // Membuat dua object String terpisah
        String kata1 = new String("Halo ");
        String kata2 = new String("Java");

        // Menggabungkan kedua String
        String kata3 = new String(kata1 + kata2);

        // Menampilkan hasil
        System.out.println("String pertama: " + kata1);
        System.out.println("String kedua: " + kata2);
        System.out.println("String ketiga: " + kata3);
    }
}
