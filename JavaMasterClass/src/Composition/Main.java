package Composition;

public class Main{
    public static void main(String[] args) {

        Case theCase = new Case("220B","Razer", "240W",new Dimensions(50,60,20));

        Monitor monitor = new Monitor("D1550", "Dell", 32,new Resolution(1920,1080));

        Motherboard motherboard = new Motherboard("LNVO1331", "Lenovo",4,2,"v.5.33");

        PC myPc = new PC(motherboard,theCase,monitor);

        myPc.getMonitor().drawPixelAt(2,5,"red");

    }
}