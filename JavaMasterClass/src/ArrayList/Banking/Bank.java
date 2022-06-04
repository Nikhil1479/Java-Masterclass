package ArrayList.Banking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName,initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);

        if(branch != null){
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }

        ArrayList<Customer> customers =branch.getCustomers();
        if(customers.size() == 0){
            return false;
        }
        System.out.println("Customer Details for Branch " + branch.getName());
        for(int i=0;i<customers.size();i++){
            Customer branchCustomer = customers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

            if(printTransaction){
                ArrayList<Double> transaction = branchCustomer.getTransactions();
                System.out.println("Transactions");
                for(int j = 0; j<transaction.size();j++){
                    System.out.println("[" + (j+1) + "]  " + "Amount " + transaction.get(j));
                }
            }
        }
        return true;
    }
    private Branch findBranch(String branch){
        for(int i = 0 ; i<branches.size();i++){
            Branch existingBranch = branches.get(i);
            if(existingBranch.getName().equals(branch)){
                return existingBranch;
            }
        }
        return null;
    }
}
