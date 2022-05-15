
public class Strings {
    public static void main(String[] args) {
        String myString = "Hello World!";
        System.out.println(findWeigthOfString(myString, 1));
    }

    public static int findWeigthOfString(String input1,int input2){
        int sum=0;
        String s=input1.toUpperCase();
        int len=input1.length();
        for(int i=0;i<len;i++){
            char letter=s.charAt(i);
            if(Character.isAlphabetic(letter)){
                if((input2==0)&&(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'))
                    sum+=0;
                else
                    sum+=letter-64;
            }
        }
        return sum;
    }
}