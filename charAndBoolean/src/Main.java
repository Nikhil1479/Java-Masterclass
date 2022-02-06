public class Main {
    public static void main(String[] args)
    {
//        Char in Java
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myUnicodeCopyright = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myUnicodeCopyright);

//        Strings in Java
        String myString = "This is myString";
        System.out.println("Value of my String "+myString);
        myString = myString + ",and this is more";
        System.out.println("Value of myString: "+ myString);
        myString = myString + "\u00A9 2022";
        System.out.println("Value of myString: "+ myString );

        String numberString = "250";
        numberString = numberString + "49.5"; //this statement will only append the numbers as the variable "myString" is
//                                              being treated as String not integer.
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;          // this statement is only appending the numbers
                                                 // but not performing the mathematical calculation
        System.out.println(lastString);
    }
}
