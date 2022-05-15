package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("Number of elements: ");
            num = sc.nextInt();
            int[] myArray = new int[num];

            for(int i = 0; i < myArray.length; i++){
                System.out.println("Enter element " + i + ": " );
            myArray[i] = sc.nextInt();
        }

//        System.out.println("Original Array");
////        printArray(myArray);
//
//        System.out.println("\nReversed Array");
        reverse(myArray);
//        printArray(myArray);
    }

    private static void reverse(int[] arr){
        System.out.println("Array = " + Arrays.toString(arr));
        int temp;
        for(int i = 0, j = arr.length-1; i < j; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }

//    private static void printArray(int[] myArray){
//        for(int i = 0; i  < myArray.length; i++){
//            System.out.println("Element at " + i + " position: " + myArray[i]);
//        }
//    }
}
