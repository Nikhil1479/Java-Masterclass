public class Dog extends Animal {
    private int tail;
    private String coat;
    private int legs;

    public Dog(int tail, String coat, int legs) {
        super("Nikhil", 1, 5, 20, 1);
        this.tail = tail;
        this.coat = coat;
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
    }

    public void chew() {
        System.out.println("Dog.chew() called");
    }
}