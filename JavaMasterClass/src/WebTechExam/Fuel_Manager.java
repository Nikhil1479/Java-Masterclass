package WebTechExam;

import java.util.Scanner;


public class Fuel_Manager {

    private double fuel_Capacity;
    private double fuel_in_tank;
    private double efficiency;

    public void get_initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel capacity of the car");
        fuel_Capacity = sc.nextDouble();
        System.out.println("Enter the fuel in the tank");
        fuel_in_tank = sc.nextDouble();
        System.out.println("Enter the efficiency of the car");
        efficiency = sc.nextDouble();
    }

    public double add_fuel() {
        double fuel_to_fill = fuel_Capacity - fuel_in_tank;
        return fuel_to_fill;
    }

    public double drive_distance() {
        double distance_travelled = fuel_in_tank / efficiency;
        return distance_travelled;
    }

    public static void main(String[] args) {
        Fuel_Manager fm = new Fuel_Manager();
        fm.get_initial();
        System.out.println("The fuel to be filled is " + fm.add_fuel());
        System.out.println("The distance travelled is " + fm.drive_distance());
    }
}