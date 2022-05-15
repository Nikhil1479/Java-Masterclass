import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];

        marks[0] = 88;
        marks[1]  = 56;
        marks[2] = 78;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array");

        int idx = sc.nextInt();
        System.out.println("Enter a number");
        int number  = sc.nextInt();
        try{
            System.out.println("Marks at index " + idx + " is: " + marks[idx]);
            System.out.println(marks[idx] + "/" + number + ": " + marks[idx] / number);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception Occured");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Airthmetic Exception found");
            System.out.println(e);
        }
    }
}
