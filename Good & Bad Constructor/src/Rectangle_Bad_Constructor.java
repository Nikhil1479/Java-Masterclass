public class Rectangle_Bad_Constructor {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle_Bad_Constructor() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle_Bad_Constructor(int width, int height){
        this.x = 0;
        this.y = 0;
        this.height = height;
        this.width = width;
    }
    public Rectangle_Bad_Constructor(int x, int y, int width, int height){
        this.height = height;
        this.width = width;
        this. x = x;
        this.y  = y;
    }
}