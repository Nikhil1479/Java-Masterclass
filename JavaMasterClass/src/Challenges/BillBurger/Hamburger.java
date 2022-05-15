package Challenges.BillBurger;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + "hamburger on a " + this.breadRollType + "roll with " + this.meat + " price is " + this.price);
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + addition1Name + "for an extra" + addition1Price );
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + addition2Name + "for an extra" + addition2Price );
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + addition3Name + "for an extra" + addition3Price );
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + addition4Name + "for an extra" + addition4Price );
    }

    public double itemizehamburger(){
        double price = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        return price;
    }
}
