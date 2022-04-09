abstract class Shape {
    private int length;
    private int breadth;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    abstract public int getArea();
}

class Rectangle extends Shape{
/**
*<h1>This is my H1 Heading</h1>
 * <p>This is my comment in paragraph tag</p>
 *
 */
    @Override
    public int getArea() {
        return getBreadth() * getLength();
    }
}

class Circle extends Shape{
    @Override
    public int getArea(){
        return (int)(Math.PI * Math.pow(getRadius(),2));
    }
}

/**
 * <h1>Hello</h1>
 * My Comment
 */
class Square extends Shape {
    @Override
    public int getArea() {
        return (int) (Math.pow(getLength(), 2));
    }
}
    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle();
            Rectangle rect = new Rectangle();
            Square square = new Square();
            rect.setLength(20);
            rect.setBreadth(10);
            circle.setRadius(25);
            square.setLength(20);

            System.out.println("Area of Circle: " + circle.getArea());
            System.out.println("Area of rectangle " + rect.getArea());
            System.out.println("Area of Square " + square.getArea());

        }
    }