package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile {
    public void output() {
        char ch;
        int num;
        try {
            FileOutputStream file = new FileOutputStream("myFile.txt");
            System.out.println("Please input some words, finish with # key and enter:");
            while ((ch = (char) System.in.read()) != '#') ////read inputed characters from keyboard
                file.write(ch); //write characters to file
            file.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void delete() {
//        String filepath= "/home/deependra17/Learnjava/myFile1.txt"; //absolute path
        String filepath = System.getProperty("user.home");
        File file = new File(filepath, "/Learnjava/myFile.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        OutputFile out = new OutputFile();
        out.output();
//        out.delete();
    }

}
