package Challenges;

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complex){
        add(complex.getReal(),complex.getImaginary());
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complex){
        subtract(complex.getReal(),complex.getImaginary());
    }
}

 class MainComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ComplexNumber complex1 = new ComplexNumber(2, 3);
        ComplexNumber complex2 = new ComplexNumber(5,6);

        complex1.add(complex2);
        System.out.println(complex1.getReal());
        System.out.println(complex1.getImaginary());
    }
}
