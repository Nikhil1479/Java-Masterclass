/*
Create a method called isEvenNumber that takes a parameter of type int
Its purpose is to determine if the argument passed to the method is an even number or not
Return true if an even number, otherwise return false.
 */

public class Main {
    public static void main(String[] args) {
        int startNum = 4;
        int lastNum = 20;
//        while (startNum <= lastNum) {
//            startNum++;
//            if (!isEvenNumber(startNum)) {
//                continue;
//            }
//            System.out.println("Even Number: " + startNum);
//        }

/*
Modify the above while code above
Make it also record the total number of even numbers it has found
and break once 5 are found
and at the end, display the total number of even numbers found
 */
        int count = 0;
        while (startNum <= lastNum) {
            startNum++;
            if (!isEvenNumber(startNum)) {

                continue;
            }
            else {
                count++;
                System.out.println("Even Number: " + startNum);
                if (count == 5)
                    break;
            }
        }
    }

    public static boolean isEvenNumber(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        return false;
    }
}