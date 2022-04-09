public class Car extends Vehicle{
    private String carModel;
    private int wheels;
    private int gears;
    private int engine;
    private int currentGear;

    public Car(String vehicleType, int loadCapacity, int weight, String carModel, int wheels, int gears, int engine) {
        super(vehicleType, loadCapacity, weight);
        this.carModel = carModel;
        this.wheels = wheels;
        this.gears = gears;
        this.engine = engine;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to: " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed){
        super.move(speed);
        System.out.println("Car.changeVelocity(): Current Velocity: " + getCurrentSpeed() + "kmph");
    }
}