public class Rectangle_Bad_Constructor {
    private int x;
    private int y;
    private int width;
    private int heigth;

    public Rectangle_Bad_Constructor() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.heigth = 0;
    }
    public Rectangle_Bad_Constructor(int width, int heigth){
        this.x = 0;
        this.y = 0;
        this.heigth = heigth;
        this.width = 0;
    }
    public Rectangle_Bad_Constructor(int x, int y, int width, int height){
        this.heigth = height;
        this.width = width;
        this. x = x;
        this.y  = y;
    }
}