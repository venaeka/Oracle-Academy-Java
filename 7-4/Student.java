
import java.util.Date;

public class Student extends Person {

    private String NIM;
    private double IP;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    public Student(String firstName, String middleName,
                   String lastName, Date dateOfBirth,
                   String NIM, String major,
                   String degree, int expectedGraduationYear) {

        super(firstName, middleName, lastName, dateOfBirth);

        this.NIM = NIM;
        this.IP = 0.0;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIP() {
        return IP;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    public void changeMajor(String newMajor) {
        major = newMajor;
    }

    public double calculateIP(String[] grades) {

        double totalPoints = 0;

        for (String grade : grades) {

            switch (grade.toUpperCase()) {
                case "A":
                    totalPoints += 4.0;
                    break;
                case "A-":
                    totalPoints += 3.67;
                    break;
                case "B+":
                    totalPoints += 3.33;
                    break;
                case "B":
                    totalPoints += 3.0;
                    break;
                case "B-":
                    totalPoints += 2.67;
                    break;
                case "C+":
                    totalPoints += 2.33;
                    break;
                case "C":
                    totalPoints += 2.0;
                    break;
                case "D":
                    totalPoints += 1.0;
                    break;
                case "F":
                    totalPoints += 0.0;
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Nilai tidak valid: " + grade
                    );
            }
        }

        if (grades.length > 0) {
            IP = totalPoints / grades.length;
        } else {
            IP = 0;
        }

        return IP;
    }
}
