
public class StudentTester {
    public static void main(String[] args) {

        // Create three student objects
        Student student1 = new Student("Mary Jones", 14, 46);
        Student student2 = new Student("John Stiner", 60, 173);
        Student student3 = new Student("Ari Samala", 31, 69);

        // Add credits and quality points to Ari Samala
        student3.addCredits(13, 52);

        // Display student information
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
