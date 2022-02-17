/*
Create a for statement using any range of numbers
Determine if the number is a prime number using the isPrime method
if it is a prime number, print it out AND increment a count of the
number of prime numbers found
if that count is 3 exit the for loop
hint:  Use the break; statement to exit
 */

public class Prime {
    public static void main(String[] args) {
       int count =0;
        System.out.println("Prime Numbers are");
    for (int i=30;i<5000;i++){
        if(isPrime(i))
        {
            System.out.print(i + " ");
            count++;
//            if(count == 3)  // IF prime numbers are three than exit the loop
//            {
//                break;
//            }
        }
    }
        System.out.println("\nTotal Prime Numbers: "+ count);
    }

public static boolean isPrime(int n) {
    if(n == 1) {
        return false;
    }
    for(int i = 2; i < n/2; i++) {
        if(n%i == 0) {
            return false;
        }
    }
    return true;
}
}