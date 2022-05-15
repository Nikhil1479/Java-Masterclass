import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args){
        try {
            File file = new File("file1.txt");
            if (file.createNewFile()) {
                System.out.println("File successfully created");
            } else {
                System.out.println("File already Exists");
            }
        }
        catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
