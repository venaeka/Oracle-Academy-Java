
import java.util.Date;
import java.util.Calendar;

public class StudentTester {

    public static void main(String[] args) {

        // Membuat tanggal lahir
        Calendar calendar = Calendar.getInstance();
        calendar.set(2005, Calendar.JANUARY, 15);
        Date birthDate = calendar.getTime();

        // Membuat objek mahasiswa
        Student student = new Student(
            "Andi",
            "",
            "Pratama",
            birthDate,
            "123456",
            "Teknik Informatika",
            "Sarjana",
            2027
        );

        // Menampilkan data mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama: " + student.getName());
        System.out.println("NIM: " + student.getNIM());
        System.out.println("Jurusan: " + student.getMajor());
        System.out.println("Gelar: " + student.getDegree());
        System.out.println("Tahun Kelulusan: "
                + student.getExpectedGraduationYear());

        // Mengubah jurusan
        student.changeMajor("Sistem Informasi");

        System.out.println("\n=== PERUBAHAN JURUSAN ===");
        System.out.println("Jurusan Baru: " + student.getMajor());

        // Menghitung IP berdasarkan array nilai
        String[] grades = {
            "A", "A-", "B+", "B", "B-"
        };

        double ip = student.calculateIP(grades);

        System.out.println("\n=== HASIL PERHITUNGAN IP ===");
        System.out.printf("IP Mahasiswa: %.2f%n", ip);
    }
}
