/*
using the for statement, call the calculateInterest method with
the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
and print the results to the console window.

How would you modify the for loop above to do the same thing as
shown but to start from 8% and work back to 2%

 */


public class Main {
    public static void main(String[] args) {
        for(int i=2; i <=5; i++)
        {
            System.out.println("10,000 at "+i+"% interest = " + calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount) *(interestRate/100);
    }
}
