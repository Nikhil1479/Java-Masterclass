package PrinterEncapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(56,true);

//        Printer printer;
//        printer =
        System.out.println("Toner Level: " + printer.fillToner(43));
        System.out.println("Total Pages Printed: "+ printer.printPages(20));
    }

}

