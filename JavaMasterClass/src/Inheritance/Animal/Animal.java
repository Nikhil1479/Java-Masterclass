package Inheritance.Animal;

public class Animal {
    private String name;
    private int Brain;
    private int size;
    private int weight;
    private int body;

    public Animal(String name, int brain, int size, int weight, int body){
        this.name = name;
        this.Brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }
    public void eat(){
        System.out.println("Inheritance.Animal.Animal.eat() called");
    }
    public void move(int speed){
        System.out.println("Inheritance.Animal.Animal Speed is: "+ speed);
    }
}
