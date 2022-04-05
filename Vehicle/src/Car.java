public class Vehicle {
    private String vehicleType;
    private int loadCapacity;
    private int weight;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String vehicleType, int loadCapacity, int weight){
        this.vehicleType = vehicleType;
        this.loadCapacity = loadCapacity;
        this.weight = weight;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.Steer(): Steering at " + currentDirection + " Degrees");
    }

    public void move(int speed){
        this.currentSpeed += speed;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + "kmph");
    }
}

class Car extends Vehicle{
    private String carModel;
    private int wheels;
    private int gears;
    private int engine;

    public Car(String vehicleType, int loadCapacity, int weight, String carModel, int wheels, int gears, int engine){
        super(vehicleType,loadCapacity,weight);
        this.carModel = carModel;
        this.wheels = wheels;
        this.gears = gears;
        this.engine = engine;
    }


    public void chngGgear(int chngeGear){
        this.gears = chngeGear;
    }
}

class Mercedes extends Car{

}
