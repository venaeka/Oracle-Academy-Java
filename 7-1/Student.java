
public class Student {
    private String name;
    private int credit;
    private double gpa;
    private double qualityPoints;

    // Constructor
    public Student(String name, int credit, double qualityPoints) {
        this.name = name;
        this.credit = credit;
        this.qualityPoints = qualityPoints;
        calculateGPA();
    }

    // Calculate GPA
    public double calculateGPA() {
        if (credit > 0) {
            gpa = qualityPoints / credit;
        } else {
            gpa = 0;
        }

        return gpa;
    }

    // Add credits and quality points
    public void addCredits(int newCredit, double newQualityPoints) {
        credit += newCredit;
        qualityPoints += newQualityPoints;
        calculateGPA();
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Quality Points: " + qualityPoints);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println();
    }
}
