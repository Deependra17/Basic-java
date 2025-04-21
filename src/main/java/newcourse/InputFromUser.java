package newcourse;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {
    public static void main(String[] args) throws IOException {
        System.out.printf("Enter a number: ");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        int num = Integer.parseInt(buff.readLine());
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        System.out.println(num);
        buff.close(); //To close resources
//        try (BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in))) //try with resources
//        {
//        int num = Integer.parseInt(buffer.readLine());
//         System.out.println(num);
//        }
    }
}
