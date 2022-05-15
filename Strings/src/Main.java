public class Main {
    public static void main(String[] args) {
//       String name = args[0];
//       int input1 = Integer.parseInt(args[1]);
//       int input2 = Integer.parseInt(args[2]);
//       String mySubstr = name.substring(input1, input2);

//       System.out.println(mySubstr);
//       String rev = reverse(mySubstr);
//       System.out.println(rev);

        String name = "Nikhil Gupta";


        System.out.println(name);
    }

    public static String reverse(String str){
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + (str.charAt(i));
        }
        return rev;
    }
}
