import java.util.Scanner;

public class arrayException {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 56;
        arr[1] = 67;
        arr[2] = 59;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
         while(flag){
             System.out.println("Enter a Valid Array Index: ");
             int idx = sc.nextInt();
             try{
                 System.out.println("Welcome to my program");
                 try {
                     System.out.println("Element at ind ex " + idx + " is: " + arr[idx]);
                     flag = false;
                 }catch(IndexOutOfBoundsException e){
                     System.out.println("Index out of bound");
                 }
             }catch(Exception e){
                 System.out.println("Exception Occured");
             }
         }

    }
}
