package Challenges.BillBurger;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("DeluxBurger","Bacon","Multigrain",19.10);
        super.addHamburgerAddition1("Chips",5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    @Override
    public double itemizehamburger() {
        System.out.println("Added chips for an Extra 2.75");;
        double chips = 2.75;
        System.out.println("Added drinks for an Extra 1.81");
        double drinks = 1.81;

        return chips + drinks + super.itemizehamburger();
    }
}
