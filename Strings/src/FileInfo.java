import java.io.File;
import java.io.IOException;
public class FileInfo {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        System.out.println("File name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("File Size: " + file.length());
    }
}
