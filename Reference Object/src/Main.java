class House{
    private String color;

    public House(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println("Object, blueHouse: " + blueHouse.getColor());
        System.out.println("Object, anotherHouse after referencing to blueHouse: " + anotherHouse.getColor());

        anotherHouse.setColor("red");
        System.out.println();
        System.out.println("Object, blueHouse after anotherHouse updated color to red: " + blueHouse.getColor());
        System.out.println("Object, anotherHouse after referencing to blueHouse: " + anotherHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println();
        System.out.println("Object, greenHouse: " + greenHouse.getColor());
        System.out.println("Object, blueHouse after anotherHouse changed it's reference to greenHouse: " + blueHouse.getColor());
        System.out.println("Object, anotherHouse after referencing to greenHouse: " + anotherHouse.getColor());
        System.out.println();

    }
}
