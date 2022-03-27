public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y) {
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

    public double distance(Point another){
        double distance;
        distance = distance(another.x, another.y);
        return distance;
    }
}