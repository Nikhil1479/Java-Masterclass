package GoodAndBAdConstructor;

public class Rectangle_Good_Constructor {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle_Good_Constructor(){
        this(0 , 0);
    }

    public Rectangle_Good_Constructor(int width, int height){
        this(0, 0, width, height);
    }

    public Rectangle_Good_Constructor(int x, int y, int width, int height){
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }
}
