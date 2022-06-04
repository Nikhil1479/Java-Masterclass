package ArrayList.Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        bank.addBranch("Dehradun");
        bank.addCustomer("Dehradun","Nikhil",400);
        bank.addCustomer("Dehradun","Rohan",500);
        bank.addCustomer("Dehradun","Priya",600);
        bank.addCustomer("Dehradun","Marc",470);

        bank.listCustomers("Dehradun", true);
    }
}
