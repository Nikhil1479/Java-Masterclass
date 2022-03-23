import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = sc.nextInt();
        System.out.println("1. Peterson Number\n2.Buzz Number\n3. Neon Number");
        choice = sc.nextInt();
//        while(true) {
            switch (choice) {
                case 1:
                    PetersonNUmber(num);
                    break;
                case 2:
                    BuzzNumber(num);
                    break;
                case 3:
                    NeonNumber(num);
                case 4:
                    System.exit(0);
            }
//        }
//        sc.close();
    }
public static void PetersonNUmber(int num)
{
    int temp=num;
    int f=1,sum=0;
    while(num!=0)
    {
        f=1;
        int r=num%10;

        for(int i=1;i<=r;i++)
        {
            f=f*i;
        }
        sum=sum+f;
        num=num/10;
    }

    if(sum==temp)
        System.out.println("PETERSON NUMBER");
    else
        System.out.println("NOT PETERSON NUMBER");
}


    public static void BuzzNumber(int num)
    {
        if (num % 10 == 7 || num % 7 == 0)
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println("Not Buzz number");
        }
    }
    public static void NeonNumber(int num)
    {
        int sum = 0;

        int square = num * num;

        while(square != 0)
        {

            int digit = square % 10;

            sum = sum + digit;

            square = square / 10;
        }
        if(num == sum)
            System.out.println(num + " is a Neon Number.");
        else
            System.out.println(num + " is not a Neon Number.");
    }
}