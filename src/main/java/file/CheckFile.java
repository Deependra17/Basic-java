package file;

import java.io.File;

public class CheckFile {
    CheckFile() {
        String name;
    }

    public void readFile() {
        File file = new File("src/main/resources/config.properties");
        System.out.println(file.canRead());
        System.out.println(file.isFile());
        System.out.println(file.canWrite());
        System.out.println(file.exists());
    }

    public static void main(String[] args) {
        CheckFile check = new CheckFile();
        check.readFile();
    }
}
