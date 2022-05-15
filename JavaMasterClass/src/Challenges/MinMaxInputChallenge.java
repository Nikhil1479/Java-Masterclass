package Challenges;

import java.util.Scanner;

public class MinMaxInputChallenge {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number "+ (count+1) + ":");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt) {
                num = sc.nextInt();

                if(num > max)
                {
                    max = num;
                }
                if(num < min)
                {
                    min = num;
                }
                count++;
            }

            else {
                System.out.println("Invalid Number Loop Exiting....\nPrinting Max and Min Values");
                break;
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println("Max Num: "+ max);
        System.out.println("Min Num: "+ min);
    }
}
