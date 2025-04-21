package patterns;

import java.util.*;

//Take a input from user for the value of a and b and display the sum of  a and b

public class InputFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of a and b is: " +sum);
    }
}
