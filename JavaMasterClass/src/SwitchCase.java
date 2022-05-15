/*
 Create a new switch statement using char instead of int
 create a new char variable
 create a switch statement testing for
 A, B, C, D, or E
 display a message if any of these are found and then break
 Add a default which displays a message saying not found
 */

public class SwitchCase {
    public static void main(String[] args) {

        char ch = 'b';

        switch (ch){
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println(ch + " found");
                break;
            default:
                System.out.println("Not Found");
        }
    }
}