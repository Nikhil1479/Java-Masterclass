public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourofDay)
    {
        if(hourofDay >= 0 && hourofDay < 24)
        {
            if(barking == true && (hourofDay > 22 || hourofDay < 8))
            {
                return  true;
            }
            else
                return false;
        }
        else
            return false;
    }
}