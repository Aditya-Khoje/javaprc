import java.util.Scanner;
import java.lang.Math;

abstract class shape {

    double a, b;

    abstract public void printArea();
}

class Rectangle extends shape {

    public double area_rect;

    public void printArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        area_rect = a * b;
        System.out.println("Length of rectangle : " + a + ", breadth of rectangle : " + b);
        System.out.println("Area of rectangle is : " + area_rect);
        System.out.println("\n");

    }
}

class Triangle extends shape {

    public double area_tri;

    public void printArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height and base of triangle : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        area_tri = a * b * 0.5;
        System.out.println("Height of triangle : " + a + ", base of triangle : " + b);
        System.out.println("Area of triangle is : " + area_tri);
        System.out.println("\n");
    }
}

class Circle extends shape {

    public double area_circle;

    public void printArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        a = sc.nextDouble();
        area_circle = (3.14 * a * a);
        System.out.println("Radius of circle : " + a);
        System.out.println("Area of circle is : " + area_circle);
        System.out.println("\n");
    }
}

class A5Area {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printArea();
        Triangle t = new Triangle();
        t.printArea();
        Circle c = new Circle();
        c.printArea();
    }
}