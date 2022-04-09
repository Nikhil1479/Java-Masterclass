import java.util.Scanner;

/*
Print the following pattern in java
Solid Rectangle

*****
*****
*****
*****

*/
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter Columns: ");
        int cols = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        {
            for(int j= 1; j<= cols; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
