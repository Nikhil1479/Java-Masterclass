package Challenges;

public class WallArea {
    private double width;
    private double height;

    public WallArea()
    {
    }
    public WallArea(double width, double height)
    {
        this.setHeight(height);
        this.setWidth(width);
    }

    public void setWidth(double width)
    {
        if(width < 0)
        {
            this.width = 0;
        }
        else
            this.width = width;
    }

    public void setHeight(double height)
    {
        if(height < 0)
        {
            this.height = 0;
        }
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }
}

class MainWallArea {
    public static void main(String[] args) {
        WallArea myWall = new WallArea(-5,-5);
        System.out.println("Area: " + myWall.getArea());
    }
}
