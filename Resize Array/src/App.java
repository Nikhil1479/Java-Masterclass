import java.util.Scanner;
import java.util.ArrayList;

public class App {

    private static int[] baseData = new int[10];

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getIntegers();

        printArray(baseData);

        resizeArray();

        getIntegers();
        printArray(baseData);
    }
    
    public static void getIntegers() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void resizeArray() {
     int [] originalArray = baseData;

     baseData = new int[12];
     for(int i = 0; i < originalArray.length; i++){
         baseData[i] = originalArray[i];
     }

    }
}