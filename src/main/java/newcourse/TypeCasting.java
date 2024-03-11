package newcourse;

import java.util.Scanner;

public class TypeCasting {

    public void cast() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = Integer.valueOf(scan.nextInt());

        System.out.println("Enter second number: ");
        int second = Integer.valueOf(scan.nextInt());

        System.out.println("Enter third number: ");
        int third = Integer.valueOf(scan.nextInt());

        System.out.println("Enter fourth number: ");
        int fourth = Integer.valueOf(scan.nextInt());

        boolean result = (first > second || third > fourth);
        System.out.println(!result);
    }

    public static void main(String[] args) {
        TypeCasting type = new TypeCasting();
        type.cast();

    }
}
