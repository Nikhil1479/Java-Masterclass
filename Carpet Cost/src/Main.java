public class Main {
    public static void main(String[] args) {
        Floor myFloor = new Floor(5, 10);
        Carpet myCarpet = new Carpet(8);

        Calculator myCalculator = new Calculator(myFloor, myCarpet);
        System.out.println(myCalculator.getTotalCost());

    }
}