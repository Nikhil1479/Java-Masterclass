/*
Write a method called printNumberInWord. The method has one parameter number which is the whole number. The
method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is
0, 1, 2,.... 9 or other for any other number including negative numbers. You can use if-else statement or
switch statement whatever is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
NOTE: Do not add main method to solution code.
 */

public class Main {
    public static void main(String[] args) {
        printNumberInWord(100);
    }
    public static void printNumberInWord(int num)
    {
        int i=1;
        num = reverse(num);
        while(i < )
        {
            switch (num % 10)
            {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            num = num / 10; i++;
        }
    }
    public static int reverse(int num){
        int reverse  = 0, remainder;
        while(num != 0)
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return reverse;
    }
    public static int getDigitCounter(int num)
    {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }
}