import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Number of Requests");
        int req_size = sc.nextInt();

        int[] req;

        req = new int[req_size];
        for(int i = 0; i < req_size; i++){
            req[i] = sc.nextInt();
        }
        System.out.println(ServerMemory1(req_size, req));
    }

    public  static int ServerMemory1(int req_size, int[] req){
        int countMem = 0;
        for(int i = 0; i < req_size; i++){
            if(i % 2 == 0) {
                countMem += req[i];
            }
        }
        return countMem;
    }
    public
}