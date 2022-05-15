public class StringMethods {
  
    public static void main(String[] args) {

        String str1 = "Nikhil";
        String str2 = "Nikhil";

//      We are not comparing the content "Nikhil"
//      We are comparing the hashCodes in str1 and str2 which will be the same as the "Nikhil".
//      Comparing the hashCode of str1 and str2.
        if(str1 == str2){
            System.out.println("str1 = str2");
        }else{
            System.out.println(str1 != str2);
        }

//      str3 and str4 are both pointing to two different objects whose content is same.
        String str3 = new String("Nikhil");
        String str4 = new String("Nikhil");

//     We are not comparing the content i.e "Nikhil"
//     We are comparing the hashCode in str3 and str4 which will be different for the String object containing "Nikhil"

        if(str3 == str4){
            System.out.println("str3 == str4");
        }else{
            System.out.println("str3 != str4");
        }
//        Output: str3 != str4
//      == wil compare reference variable i.e hashCodes not the real content i.e. "Nikhil"

//        So to compare strings:

//        1) .equals() method
        if(str3.equals(str4)){
            System.out.println("str3 equals str4");
        }else{
            System.out.println("str3 not equals str4");
        }

//       2) compareTo() method
//        if s1 > s2, returns positive integer
//        if s1 < s2, return negative integer
//        if s1 == s2, return 0
        if(str3.compareTo(str4) == 0){
            System.out.println("str3 compared to str4");
        }else if(str3.compareTo(str4) > 0){
            System.out.println("str3 > str4");
        }else if(str3.compareTo(str4) < 0){
            System.out.println("str3 > str4");
        }


//        String Methods
        String str = "John, Jennie, Jim, Jack, Joe";

//      1) Length() -> return length of a String
        int len = str.length();
        System.out.println("Length if str is: "+ len);

//      2) charAt() -> return the char value for particular index
        System.out.println(str.charAt(6));

//      3) substring() -> returns substring for given index
        int beginIndex = 6;
        int endIndex = 11;
        String substr = str.substring(beginIndex, endIndex-1); //endIndex-1 because in Strings character indexing starts from 0 to n.

//      4) contains() -> returns true or false after matching sequence of char value
        boolean contains;
        contains = str.contains("John");

        if(contains){
            System.out.println("John is in the str");
        }else{
            System.out.println("John is not in the str");
        }

//      5) isEmpty() -> it checks if the String is empty or not
        if(str.isEmpty()){
            System.out.println("String is empty");
        }else{
            System.out.println("String is not empty");
        }

//     6) concat() -> it concatenates the specified String
        str.concat(", Nikhil"); // It will not concatenate the "str" as Strings are Immutable.
        String strConc = str.concat(", Nikhil");
        System.out.println("Before concatenation: " + str);
        System.out.println("After Concatenation: "+ strConc);

//     7) replace() -> It replaces all occurrences of the specified Char Sequence
        String strReplace = str.replace("J", "K");
        System.out.println("After Replacing J -> K: " + strReplace);

//     8) split() -> method breaks a given string around matches of the given regular expression.
//        After splitting against the given regular expression, this method returns a String array.
        System.out.println("\nSplitting Strings");
        String[] strArray = str.split(", ",0);
        for(int i = 0;i<strArray.length;i++){
            System.out.println("strArray["+i+"]: " + strArray[i]);
        }

//     9) indexOf() -> returns the index of a specified char value
        System.out.println("Index of character: " + str.indexOf("J"));

    }
}
