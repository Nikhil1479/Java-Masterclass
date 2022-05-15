import java.util.*;

 class Solution{
    public static void main(String[] args)
    {
        String reversedString = "";
        Scanner sc= new Scanner(System.in);
        String cla = args[0];


        System.out.println("Enter String 2 :");
        String s2=sc.nextLine();

        String s3=cla+s2;
        System.out.println(s3);
        for (int i = s3.length() - 1; i >= 0; i--)
            reversedString += s3.charAt(i);

        System.out.println(reversedString);

    }
}