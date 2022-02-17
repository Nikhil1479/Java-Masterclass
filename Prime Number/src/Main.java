public class Main {
    public static void main(String[] args) {
        int count =0;
        for(int i = 10; i <50; i++)
        {
            if(isPrime(i))
            {
                count += 1;
                System.out.println(i + " is a prime number");
            }
        }
        System.out.println(count + " Prime Numbers Found");
    }


    public static boolean isPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }

        for(int i = 2; i < num/2; i++)
        {
            if (num % i == 0)
                return false;
        }
        return  true;
    }
}