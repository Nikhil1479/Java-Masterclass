package Challenges;

import java.util.Scanner;

class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber == 0)
            return 0;
        else
            return this.firstNumber / this.secondNumber;
    }
}

class MainSimpleCalculator {
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