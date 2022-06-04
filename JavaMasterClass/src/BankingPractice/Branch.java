package BankingPractice;

import ArrayList.Banking.Customer;

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

    public boolean newCustomer(String name, double initialTransaction){
        if(findCustomer(name) != null){
            customers.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer existingCustomer = findCustomer(name);
        if(findCustomer(name) != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    public Customer findCustomer(String name){
        for(int i = 0; i < customers.size();i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
            return null;
    }
}
