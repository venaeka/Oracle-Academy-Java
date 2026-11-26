public class Student {

    // Deklarasi variabel
    private String fName = "Lisa";
    private String lName = "Palombo";
    private int stuId = 123456789;
    private String stuStatus = "Active";

    // Constructor
    public Student() {
    }

    // Method untuk menampilkan informasi Student
    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}