public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInches(10);
    }

    public static double calcFeetAndInches(double feet, double inches )
    {
        if(feet >= 0 && inches >= 0 && inches <= 12)
        {
            return ((feet * 12) + (inches)) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInches(double inches)
    {
        if (inches >= 0)
        {
            int feet = (int)inches / 12;
            double myInches = inches % 12;

            System.out.println(feet +" Feet, " + myInches + " Inches" + " to Centimeters is " + calcFeetAndInches(feet,myInches));
        }
        return -1;
    }
}