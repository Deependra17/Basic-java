package exceptionhandling;

public class Abc {
    static int divideByZero(int a, int b) {
        int i = a / b;
        return i;
    }

    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception occurred");
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
