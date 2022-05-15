class Account {
    private int accountNumber;
    private double balance;
    private String phoneNumber;
    private String CustomerName;
    private String email;

    public Account()
    {
        //Calling Another Parameterized Constructor
        this(20051523, "9568391020", "Nikhil", "niks1479@outlook.com");
//       After running "this" statement it will call the parameterized constructor i.e first the constructor which has parameters will run then the
//       default constructor will run

        System.out.println("Empty Constructor Called");
    }
    // Constructor (Parametrized)
    public Account(int accountNumber, String phoneNumber, String customerName, String email)
    {
        System.out.println("Parameterized Constructor Called");
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.CustomerName = customerName;
        this.email = email;
    }

    public void depositFund(double amount)
    {
        this.balance = this.balance +amount;
    }
    public void withdrawFund(double withdrawAmt)
    {
        if(this.balance - withdrawAmt < 0)
        {
            System.out.println("⚠️ Insufficient Balance");

        }
        else{
            this.balance = this.balance - withdrawAmt;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
    }
}
public class Constructors {
    public static void main(String[] args) {
//        Account myAcc = new Account();  // Default Constructor Automatically invoked by java

//        Parameterized Constructor
        Account myAcc = new Account();
//        (20051523,"9568391020","Nikhil","niks1479@outlook.com"); //Parameters to be passes in Constructor

//        System.out.println(myAcc.getPhoneNumber());

    }
}
