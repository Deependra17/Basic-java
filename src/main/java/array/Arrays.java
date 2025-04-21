package array;

import java.util.Scanner;

public class Arrays {
    public static void simpleArray() {
        //        int[] marks = new int[3];
        //        int marks[] = new int[3];
        int marks[] = {90, 98, 80};
//        marks[0] = 90; //phy
//        marks[1] = 98; //chem
//        marks[2] = 80; //eng
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }

    public static void userInputArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        //output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void indexUserInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int number[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        //output

        for (int i = 0; i < number.length; i++) {
            if(number[i]==x) {
                System.out.println("X found at index: "+ i);
            }
        }

    }

    public static void main(String[] args) {
        new Arrays();
//        userInputArray();
//        simpleArray();
        indexUserInput();

    }
}
