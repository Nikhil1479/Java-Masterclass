package Challenges;

/**
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the
range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the
method should return false.

EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(21,23));
    }

    public static boolean hasSharedDigit(int num1, int num2)
    {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99 ) {
            return false;
        }

        int digit1, digit2, myNum2;
        myNum2 = num2;
        while(num1 != 0)
        {
            digit1 = num1 % 10; // digit1 =  21 % 10 == 1
            num2 = myNum2;

            /* num2 is stored in myNum2 variable because when inner loop will run it will change the
            original value of num2 as "num2 = num2 / 10" and when we will be checking for the next iteration it
            will not take the original value it will take the update value, to avoid this conflict we have
            stored original value in myNum2 variable and taking that value to update the update num2 variable
            to it's original Value */

            while(num2 != 0)
            {
                digit2 = num2 % 10; //  digit2 = 23 % 10 == 3
                if(digit1 == digit2)
                    return true;
                num2 = num2 / 10;  // 23 / 10 == 2
            }
            num1 = num1 / 10; // 21 / 10 == 2
        }
        return false;
    }
}