package Inheritance.Animal;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int size, int weight, int body, int gills, int eyes, int fins){
        super(name, brain, size, weight, body);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    public void backfin(){
        System.out.println("Fish.backfun() called");
    }
    public void moveMuscle(){
        System.out.println("Fish.moveMuscle() called");
    }
    public void swim(){
        System.out.println("Fish.swin() called");
        backfin();
        moveMuscle();
        super.move(5);
    }
}