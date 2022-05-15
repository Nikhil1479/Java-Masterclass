public class FloatDatatype {
    public static void main(String[] args)
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

//        float myFloatValue = 5.25;  //This error is due to that JAVA takes double as default datatype
//                                    In case of floating point numbers. We need to typecast it into float.
        float myFloatValueCasted = (float) 5.25;
//                         OR
        float myFloatValueCastedAlternate = 5.25f;

        double myPound = 500d;
        double myKilogram = myPound * 0.45359237d;
        System.out.println(myPound + " In Kilogram is: "+ myKilogram + "kg");

    }
}
