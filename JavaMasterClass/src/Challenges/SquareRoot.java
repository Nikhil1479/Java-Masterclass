package Challenges;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(49, 3));
    }


    public static double squareRoot(int num, int p) {
        int start = 0, mid, end = num;
        double ans = 0 ,inc = 0.1;


        while (start <= end) {

            mid = (start + end) / 2;  // pointing mid to the middle element
            if (mid * mid == num) {   // checking if the middle element is the sq root
                ans = mid;
                break;                // if condition matches break the loop
            }

            else if (mid * mid < num) {  // if square of mid element is < number
                start = mid + 1;         // incrementing start as the answer lies on right part
                ans = mid;
            }

            else {
                end = mid - 1;          // if square of mid element > num
                // decrementing end as the answer lies in left part
            }
        }

        //Fractional part
        for(int i = 0; i<p;i++)
        {
            while(ans * ans <= num) // checking the square is less than num
            {
                ans = ans + inc;   // if less than num add decimal precision(initially 0.1) to ans
            }
            ans = ans - inc;       // if condition fails decrement the ans by one current precision
            inc = inc / 10;        // increasing the precision of inc to be further added to ans.
        }
        return ans;
    }
}
