public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("healthyBurger", meat, "MultiGrain",price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println(name + "has been added for an extra price of " + price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println(name + "has been added for an extra price of " + price);
    }

    @Override
    public double itemizehamburger() {
        return healthyExtra1Price + healthyExtra2Price + super.itemizehamburger() ;
    }
}
