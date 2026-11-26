
import java.util.Scanner;

public class MatrixOperations {

    static final int SIZE = 2;

    // Method to input a matrix
    public static void inputMatrix(Scanner input, int[][] matrix, String name) {
        System.out.println("Enter values for Matrix " + name + ":");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Enter value [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method for matrix addition
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // Method for matrix subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Method for matrix multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = 0; k < SIZE; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[SIZE][SIZE];
        int[][] B = new int[SIZE][SIZE];

        boolean matrixAEntered = false;
        boolean matrixBEntered = false;

        char choice;

        do {
            System.out.println("\n===== MATRIX MENU =====");
            System.out.println("a. Enter Matrix A");
            System.out.println("b. Enter Matrix B");
            System.out.println("c. Display A + B");
            System.out.println("d. Display A - B");
            System.out.println("e. Display A * B");
            System.out.println("f. Exit");
            System.out.print("Choose an option: ");

            choice = input.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    inputMatrix(input, A, "A");
                    matrixAEntered = true;
                    break;

                case 'b':
                    inputMatrix(input, B, "B");
                    matrixBEntered = true;
                    break;

                case 'c':
                    if (matrixAEntered && matrixBEntered) {
                        System.out.println("\nA + B:");
                        displayMatrix(addMatrices(A, B));
                    } else {
                        System.out.println("Please enter Matrix A and Matrix B first.");
                    }
                    break;

                case 'd':
                    if (matrixAEntered && matrixBEntered) {
                        System.out.println("\nA - B:");
                        displayMatrix(subtractMatrices(A, B));
                    } else {
                        System.out.println("Please enter Matrix A and Matrix B first.");
                    }
                    break;

                case 'e':
                    if (matrixAEntered && matrixBEntered) {
                        System.out.println("\nA * B:");
                        displayMatrix(multiplyMatrices(A, B));
                    } else {
                        System.out.println("Please enter Matrix A and Matrix B first.");
                    }
                    break;

                case 'f':
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 'f');

        input.close();
    }
}
