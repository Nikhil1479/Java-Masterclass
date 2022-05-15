import java.io.BufferedReader;
import java.io.InputStreamReader;

class Palindrome
{
    public static void main(String[] args)
    {
        int i,j,k,l,m,n;
        String s;
        System.out.println("Enter the file name");
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the starting index");
        i=Integer.parseInt(System.console().readLine());
        System.out.println("Enter the ending index");
        j=Integer.parseInt(System.console().readLine());
        k=i;
        l=j;
        m=0;
        n=0;
        while(k<=l)
        {
            m=m+1;
            k=k+1;
        }
        while(i<=j)
        {
            n=n+1;
            i=i+1;
        }
        if(m==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}