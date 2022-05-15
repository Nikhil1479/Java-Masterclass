package Arrays;

import java.util.Scanner;

public class MinimumElement {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int num = readIntegers();
        // readElements();


      int[] myArray = readElements(num);
        printArray(myArray);
        System.out.println("\nMinimum Element in Array is: " + findMin(myArray));
    }
    
    public static int readIntegers() {
        // Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number of Elements you want to insert in an Array: ");
        int num = sc.nextInt();

        return num;
    }

    public static int[] readElements(int num) {
        System.out.println("Enter elements in array");
        // Scanner sc = new Scanner(System.in);
        int[] myArray = new int[num];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }
    public static int findMin(int[] myArray){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<myArray.length; i++){
            if(myArray[i] < min){
                min = myArray[i];
            }
        }
        return min;
    }
    public static void printArray(int[] myArray){
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", " );
        }
        System.out.print("]");
    }
}
