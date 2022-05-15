import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("file1.txt");
            file.write("Java is my Favourite Language");
            System.out.println("Successfully wrote to file");
            file.close();
        }
        catch(IOException e){
            System.out.println("An error Occurred");
            e.printStackTrace();
        }
    }

}
