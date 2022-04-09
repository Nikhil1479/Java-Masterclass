/**
 * This class is used to create a bank account.
 */
public class Bank {
    private int accountNumber;
    private double balance;
    private int phoneNumber;
    private String CustomerName;
    private String email;

//    Constructor
    public Bank(String CustomerName, String email, int phoneNumber)
    {
        this.CustomerName = CustomerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//  Setters
    // The above code is the setters.
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setCustomerName(String customerName)
    {
        this.CustomerName = customerName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

//  Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
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
}
