package tasks;

import java.util.Scanner;

//WAP to print Fibonacci series of n terms where n is input by user: 0 1 1 2 3 5 8 13 21....

public class FibonacciSeries {
    public static void printFibonacciSeriesOfNTerms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Enter valid positive number.");
        }
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;

        }
    }

    public static void main(String[] args) {
        new FibonacciSeries();
        printFibonacciSeriesOfNTerms();
    }
}
