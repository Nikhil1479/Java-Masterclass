import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File file = new File("file1.txt");
            Scanner sc = new Scanner(file);
            String data = sc.nextLine();
            System.out.println(data);
        }
        catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}