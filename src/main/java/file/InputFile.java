package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputFile {

    char ch;
    int num;

    public void readInputFile() {
        try {
            FileInputStream fin = new FileInputStream("myFile.txt");
            while ((num = fin.read()) != -1)
                System.out.print((char) num);
            fin.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        InputFile input = new InputFile();
        input.readInputFile();
    }
}
