
/*
Design a class ‘Complex’ with data members for real and imaginary part. Provide default and Parameterized constructors. Write a program to perform arithmetic operations of two complex numbers.
*/
import java.util.Scanner;

class Complex {
    float real, imaginary;

    Complex() {

    }

    Complex(float p, float q) {
        real = p;
        imaginary = q;
    }

    void printData() {
        System.out.println(real + "+" + imaginary + "i");
    }

    static Complex addtion(Complex p, Complex q) {
        Complex temp = new Complex();
        temp.real = p.real + q.real;
        temp.imaginary = p.imaginary + q.imaginary;
        return temp;
    }

    static Complex subtraction(Complex p, Complex q) {
        Complex temp = new Complex();
        temp.real = p.real - q.real;
        temp.imaginary = p.imaginary - q.imaginary;
        return temp;
    }

    static Complex multiplication(Complex p, Complex q) {
        Complex temp = new Complex();
        temp.real = (p.real * q.real) - (p.imaginary * q.imaginary);
        temp.imaginary = (p.real * q.imaginary) + (p.imaginary * q.real);

        return temp;
    }

    static Complex division(Complex p, Complex q) {
        Complex temp = new Complex();

        temp.real = ((p.real * q.real) + (p.imaginary * q.imaginary))
                / ((q.real * q.real) + (q.imaginary * q.imaginary));
        temp.imaginary = ((p.imaginary * q.real) - (p.real * q.imaginary))
                / ((q.real * q.real) + (q.imaginary * q.imaginary));
        return temp;
    }
}

public class A1ComplexNum {
    public static void main(String args[]) {
        float a, b;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number : ");
        a = s.nextFloat();
        b = s.nextFloat();
        Complex c1 = new Complex(a, b);

        System.out.print("Enter second number : ");
        a = s.nextFloat();
        b = s.nextFloat();
        Complex c2 = new Complex(a, b);

        System.out.print("First complex number : ");
        c1.printData();
        System.out.print("Second complex number : ");
        c2.printData();

        Complex result = new Complex();

        System.out.print("Addition : ");
        result = Complex.addtion(c1, c2);
        result.printData();

        System.out.print("Subtraction : ");
        result = Complex.subtraction(c1, c2);
        result.printData();

        System.out.print("Multiplication : ");
        result = Complex.multiplication(c1, c2);
        result.printData();

        System.out.print("Division : ");
        result = Complex.division(c1, c2);
        result.printData();
    }
}