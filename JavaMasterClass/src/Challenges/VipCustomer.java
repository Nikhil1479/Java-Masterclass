package Challenges;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer()
    {
        this("nikhil",10000,"niks1479@outlook.com");
        System.out.println("Empty Constructor");
    }

    public VipCustomer(String name, int creditLimit)
    {
        this(name, creditLimit, "niks1479@outlook.com");
        System.out.println("Constructor with 2 Arguments Called");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        System.out.println("Constructor with 3 Arguments Called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
class MainVipCustomer {
    public static void main(String[] args) {
        VipCustomer nikhil = new VipCustomer("Nikhil",10000);
    }
}
