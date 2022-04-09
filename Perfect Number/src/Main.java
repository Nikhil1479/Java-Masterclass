public class Main {
    public static void main(String[] args) {
        boolean isPerfectNumber = isPerfectNumber(6);
        if(isPerfectNumber)
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }

    }
    public static boolean isPerfectNumber(int num){
        if(num < 1){
            return false;
        }
        else{
            int sum = 0;
            for(int i = 1; i <= num / 2; i++){
                if(num % i == 0){
                    sum += i;
                }
            }
            if(num == sum){
                return true;
            }
            else{
                return false;
            }
        }
    }
}