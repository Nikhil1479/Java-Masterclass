import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of Aliens");
        }
        int topScore = 80;
        if(topScore > 100)
        {
            System.out.println("You have got highest marks");
        }
        int secondScore = 60;
        if ((topScore > secondScore) && (topScore < 100))
        {
            System.out.println("Greater than Second top score & less than 100");
        }

        if((topScore >= 90) || (secondScore <=60))
            System.out.println("Either Both Conditions are true or One Condition is true");

        Scanner sc = new Scanner(System.in);

        int ageOfClient = 20;
        boolean isEighteenOrOver;
        isEighteenOrOver = (ageOfClient == 20) ? true : false;  //Ternary Operator

//        if(ageOfClient == 20)
//        {
//           isEighteenOrOver= true;
//        }
//            else
//               isEighteenOrOver= false;
        System.out.println(isEighteenOrOver);

    }
}
