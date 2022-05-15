package Challenges;

public class PrimitiveDatatypeChallenge {
    public static void main(String[] args)
    {
        byte myChallengeByte = 10;
        short myChallengeShort = 20;
        int myChallengeInt = 50;

        int myChallengeSum = myChallengeByte + myChallengeInt + myChallengeShort;

        long myChallengeLong = 50000L + 10L*(myChallengeSum);

        System.out.println("Long Challenge Value: "+ myChallengeLong);

//        System.out.println(myChallengeLong.getClass().getSimpleName());S
    }
}
