package patterns;

import java.util.Scanner;

public class ConditionalStatement {
    //Switch statement

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Deepen");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}
