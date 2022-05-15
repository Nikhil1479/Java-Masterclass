class Car{
    private int doors;
    private int wheels;
    private String engine;
    private String colour;
    private String model;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("s class") || validModel.equals("c class"))
        {
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
    }
    public void setDoors(int doors)
    {
        this.doors = doors;
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
    public void setEngine(String engine)
    {
        this.engine = engine;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getModel()
    {
        return this.model;
    }
}
public class Classes{
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.setModel("S Class");
        System.out.println(mercedes.getModel());
    }
}