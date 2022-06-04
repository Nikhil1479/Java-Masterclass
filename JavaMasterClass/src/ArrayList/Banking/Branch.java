package ArrayList.Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }else{
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer existingCustomer = findCustomer(name);
        if(findCustomer(name) != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customername){
        for(int i = 0 ; i<customers.size();i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(customername)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
