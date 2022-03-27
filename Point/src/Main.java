import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point1 myPoint = new Point1(6 , 5);

        Point1 second = new Point1(2,2);
        System.out.println(myPoint.distance(second));
    }
}