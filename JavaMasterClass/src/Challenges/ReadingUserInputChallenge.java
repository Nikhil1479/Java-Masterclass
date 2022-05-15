package Challenges;

import java.util.Scanner;

public class ReadingUserInputChallenge
{
    public static void main(String[] args) {
        int num, sum=0, count = 0, order;
        boolean hasNextInt;

        Scanner sc = new Scanner(System.in);

        while(count < 10)
        {
            order = count + 1;
            System.out.println("Enter number #" + order + ": ");
            hasNextInt = sc.hasNextInt();

            if(hasNextInt) {
                num = sc.nextInt();
                sum += num;
                count++;
            }
            else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println("Sum of Numbers: "+sum);
    }
}
