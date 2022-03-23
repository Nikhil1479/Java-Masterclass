import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        calc.setFirstNumber(num1);
        calc.setSecondNumber(num2);

        System.out.println("Addition: "+ calc.getAdditionResult());
        System.out.println("Subtraction: "+ calc.getSubtractionResult());
        System.out.println("Multiplication: "+ calc.getMultiplicationResult());
        System.out.println("Division: "+ calc.getDivisionResult());
        sc.close();
    }
}