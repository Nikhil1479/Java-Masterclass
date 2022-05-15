package Arrays;

import java.util.Scanner;

class SortedArray{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = getIntegers(6);
        sortIntegers(myArray);
        printArray(myArray);
    }

    public static int[] getIntegers(int size){
        System.out.println("Enter " + size + " integers \r");
        int[] values = new int[size];

        for(int i = 0; i < values.length; i++){
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static int[] sortIntegers(int[] array){
        for(int i =0; i < array.length; i++){
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j] < array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }
    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}