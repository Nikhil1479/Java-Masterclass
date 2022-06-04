package WebTechExam;

interface  transaction{
    public void deposit(int amount);
    public void withdraw(int amount);
}

class HDFC implements transaction{
    private int balance=0;
    @Override
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " Rs deposited to your HDFC account");
    }

    @Override
    public void withdraw(int amount) {
        if(balance-amount <= 0 ){
            System.out.println("Insufficient Funds");
        }else {
            balance = balance - amount;
            System.out.println(amount + " Rs withdrawed from your HDFC account");
        }
    }
}
class ICICI implements transaction{
private int balance=0;
    @Override
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " Rs deposited to your ICICI account");
    }

    @Override
    public void withdraw(int amount) {
        if(balance-amount <= 0 ){
            System.out.println("Insufficient Funds");
        }else {
            balance = balance - amount;
            System.out.println(amount + " Rs withdraw from your ICICI account");
        }
    }
}
public class Bank {
    public static void main(String[] args){
        HDFC hdfc = new HDFC();
        ICICI icici = new ICICI();

        hdfc.deposit(50);
    }
}
