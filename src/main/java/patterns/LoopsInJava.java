package patterns;

import java.util.Scanner;

public class LoopsInJava {

    public void forLoop() {
        //For Loop
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public void whileLoop() {
        //while
        int i = 0;
        while (i < 7) {
            System.out.println(i);
            i++; //i= i+1;
        }
    }

    public void doWhileLoop() {
        //do while
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    public void solveTask() {

        //Print the sum of first n natural number.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i; //sum++
        }
        System.out.println(sum);
    }

    public void task2() {

        //Print the table of a number input by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
