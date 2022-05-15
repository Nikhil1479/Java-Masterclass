import java.lang.Math;
public class Triangle{
    public int a;
    public int b;
    public int c;
Triangle(){
    this.a=0;
    this.b=0;
    this.c=0;
}
    public Triangle(int a, int b, int c) throws NoTriangleFormException{
        if((a + b < c) || (b + c < a) || (c + a <  b)) {
            throw new NoTriangleFormException("Not a valid Triangle");
        }
            System.out.println("It is a valid Triangle");
            this.a = a;
            this.b = b;
            this.c = c;
    }

    public double Find_area_90(){
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public double Find_perimeter(){
        double perimeter = a + b +c;
        return perimeter;
    }

    public static void main(String[] args){
        Triangle triangle = new Triangle();
        try {
            triangle = new Triangle(10,20,24);
            System.out.println(triangle.Find_area_90());
            System.out.println(triangle.Find_perimeter());
        }
         catch (NoTriangleFormException e){
            System.out.println("Exception Found");
            e.printStackTrace();
        }
    }
    }
class NoTriangleFormException extends Exception{
    public NoTriangleFormException(String str) {
        super(str);
    }
}