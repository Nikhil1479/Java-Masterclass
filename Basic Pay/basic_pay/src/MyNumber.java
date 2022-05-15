import java.util.Scanner;

interface IntOperations {
// These methods will be implemented in MyNumber Class
    public void isPositiveNegative();
    public void isEvenOdd();
    public void isPrime();
    public void factorial();
    public void sumOfDigits();
}
class MyNumber implements IntOperations {
    public static void main(String[] arg)  { // Main Method
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(arg[0]);

        MyNumber number = new MyNumber(num); // Creating a new object of MyNumber Class
        System.out.println("Menu");
        System.out.println("1 - Positive or Negative");
        System.out.println("2 - Even or Odd");
        System.out.println("3 - Prime");
        System.out.println("4 - Factorial");
        System.out.println("5 - Sum of digits");
        System.out.println("Enter Choice [1-6]");

        int choice = sc.nextInt();
        switch (choice) { // Switch case to achieve menu-driven program
            case 1:
                number.isPositiveNegative();
                break;
            case 2:
                number.isEvenOdd();
                break;
            case 3:
                number.isPrime();
                break;
            case 4:
                number.factorial();
                break;
            case 5:
                number.sumOfDigits();
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
    }

    public int number;
    MyNumber() {
        this.number = 0;  //Initializing number to 0
    }
    MyNumber(int num) {// Accepting the passed arguments
        this.number = num; // Initializing value of number to desired value
    }


    public void isEvenOdd() { // this method will check whether number is even or odd
        if (this.number % 2 == 0)
            System.out.println("\nEven Number");
        else
            System.out.println("\nOdd Number");
    }

    public void isPrime() { // this method will check whether number is Prime or not Prime
        int i = 2;
        while (i != this.number) {
            if (this.number % i == 0) {
                System.out.println("\nNot Prime");
                break;
            }
            i++;
        }
        if (this.number == i)
            System.out.println("\nPrime");
    }
    public void isPositiveNegative() { // this method will check whether a number is positive or negative

        if (this.number < 0)
            System.out.println("\nNegative Number");
        else
            System.out.println("\nPositive Number");
    }
    public void factorial() { // this method will calculate the factorial of the number
        int product = 1, i = 1;
        while (i <= this.number) {
            product *= i++;
        }
        System.out.println("\nFactorial: " + product);
    }

    public void sumOfDigits() { // this method will calculate the sum of all the digit
        int sum = 0;
        int i = this.number;
        while (i != 0) {
            sum += (i % 10);
            i = i / 10;
        }
        System.out.println("\nSum Of Digit " + sum);
    }
}