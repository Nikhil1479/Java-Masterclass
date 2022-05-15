package PrinterEncapsulation;

public class Printer {
    private int tonerLevel;
    private int numberOfPages=0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.numberOfPages = 0;
        this.duplex = duplex;
    }


    public int fillToner(int fillInk){
        if(((this.tonerLevel+fillInk) > 0) && ((this.tonerLevel +fillInk) <=100)) {
            this.tonerLevel += fillInk;
            return tonerLevel;
        }
        else
            return -1;
    }

    public int printPages(int numberOfPages){
        if(duplex) {
            for (int i = 0; i < numberOfPages/2; i++) {
                this.numberOfPages++;
            }
            System.out.println("Printing in Duplex Mode");
            return this.numberOfPages;
        }
        else{
            for (int i = 0; i < numberOfPages; i++) {
                this.numberOfPages++;
            }
            return this.numberOfPages;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex(){
        return duplex;
    }
}
