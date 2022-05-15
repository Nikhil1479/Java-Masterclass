package Challenges;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage()
    {
        int num, sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                num = sc.nextInt();
                sum += num;
                count++;
            }

            else {

                System.out.println("SUM = "+ sum + " AVG = "+ Math.round((double)sum/count));
                break;
            }
        }
        sc.close();
    }
}
