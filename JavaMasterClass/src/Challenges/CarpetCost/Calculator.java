package Challenges.CarpetCost;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }
    public double getTotalCost(){
        double totalCost = floor.getArea() * carpet.getCost();
        return  totalCost;
    }
}

