import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ComplexNumber complex1 = new ComplexNumber(2, 3);
        ComplexNumber complex2 = new ComplexNumber(5,6);

        complex1.add(complex2);
        System.out.println(complex1.getReal());
        System.out.println(complex1.getImaginary());
    }
}
