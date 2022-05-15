public class ConditionalChallenge {
    public static void main(String[] args)
    {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;

        double myValueTotal = (myFirstDouble + mySecondDouble) * 100;
        System.out.println("myValueTotal: "+myValueTotal);

        double myRemainder = myValueTotal % 40.00d;
        System.out.println("myRemainder: "+myRemainder);

        boolean myBool;
        if(myRemainder == 0)
        {
            myBool = true;
        }
        else {
            myBool = false;
        }
        System.out.println("myBool: "+ myBool);

        if (!myBool) //basically it is myBool == false;
        {
            System.out.println("Got Some Remainder");
        }

    }
}
