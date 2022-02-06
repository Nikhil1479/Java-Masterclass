public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        int firstNum = (int)(num1 * 1000);
        int secondNum = (int)(num2 * 1000);
        int equality = firstNum - secondNum;

        if(equality == 0)
        {
            return true;
        }
        else
            return false;

    }
}
