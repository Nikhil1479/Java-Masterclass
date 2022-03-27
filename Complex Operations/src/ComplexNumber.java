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
