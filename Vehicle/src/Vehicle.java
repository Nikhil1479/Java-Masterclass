public class Vehicle {
    private String vehicleName;
    private int loadCapacity;
    private int weight;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String vehicleName, int loadCapacity, int weight){
        this.vehicleName = vehicleName;
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

    public void stop(){
        this.currentSpeed = 0;
    }


//    Getters
    public String getVehicleName() {
        return vehicleName;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}