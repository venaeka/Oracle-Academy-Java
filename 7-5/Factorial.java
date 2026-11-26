
public class Factorial {

    public int num = 10;

    public int getFactorial() {
        int factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        return factorial;
    }

    @Override
    public String toString() {

        String hasil = "Factorial: " + num + "! = ";

        for (int i = 1; i <= num; i++) {
            hasil += i;

            if (i < num) {
                hasil += " * ";
            }
        }

        hasil += " = " + getFactorial();

        return hasil;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println(factorial);
    }
}
