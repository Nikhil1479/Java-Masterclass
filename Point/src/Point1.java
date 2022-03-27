import java.awt.*;

public class Point1 {
    private int x;
    private int y;

    public Point1()
    {}

    public Point1(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double distance;
        distance = Math.sqrt(((0 - getY())*(0 - getY())) + ((0 - getX())*(0-getX())));
        return distance;
    }
    public double distance(int x, int y){
        double distance;
        distance = Math.sqrt(((y - getY())*(y - getY())) + ((x - getX())*(x-getX())));
        return distance;
    }

    public double distance(Point1 another){
        return distance(another.x,another.y);
    }
}
