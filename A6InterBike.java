
import java.util.*;

interface Vehicle {
    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);
}

class Bicycle implements Vehicle {

    int speed;
    int gear;

    Bicycle(int s, int g) {
        speed = s;
        gear = g;
    }

    public void changeGear(int newGear) {

        gear = newGear;
    }

    public void speedUp(int increment) {

        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Car implements Vehicle {

    int speed;
    int gear;

    Car(int s, int g) {
        speed = s;
        gear = g;
    }

    public void changeGear(int newGear) {

        gear = newGear;
    }

    public void speedUp(int increment) {

        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    Bike(int s, int g) {
        speed = s;
        gear = g;
    }

    public void changeGear(int newGear) {

        gear = newGear;
    }

    public void speedUp(int increment) {

        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

public class A6InterBike {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the current speed of Bicycle :");
        a = s.nextInt();
        System.out.print("Enter the current gear of Bicycle :");
        b = s.nextInt();
        Bicycle B1 = new Bicycle(a, b);
        System.out.print("Bicycle initial state :");
        B1.printStates();
        System.out.print("Enter the gear to change :");
        a = s.nextInt();
        B1.changeGear(a);
        System.out.print("Enter the value to speedup by:");
        a = s.nextInt();
        B1.speedUp(a);
        System.out.print("Enter the value to decrese by:");
        a = s.nextInt();
        B1.applyBrakes(a);
        System.out.println("Bicycle present state :");
        B1.printStates();
        System.out.println("");
        System.out.print("Enter the current speed of Bike :");
        a = s.nextInt();
        System.out.print("Enter the current gear of Bike :");
        b = s.nextInt();
        Bike b1 = new Bike(a, b);
        System.out.print("Bike initial state :");
        b1.printStates();
        System.out.print("Enter the gear to change :");
        a = s.nextInt();
        b1.changeGear(a);
        System.out.print("Enter the value to speedup by:");
        a = s.nextInt();
        b1.speedUp(a);
        System.out.print("Enter the value to decrese by:");
        a = s.nextInt();
        b1.applyBrakes(a);
        System.out.println("");
        System.out.println("Bike present state :");
        b1.printStates();

        System.out.print("Enter the current speed Car :");
        a = s.nextInt();
        System.out.print("Enter the current gear Car :");
        b = s.nextInt();
        Car c1 = new Car(a, b);
        System.out.println("initial state of car:");
        c1.printStates();
        System.out.print("Enter the gear to change :");
        a = s.nextInt();
        c1.changeGear(a);
        System.out.print("Enter the value to speedup by:");
        a = s.nextInt();
        c1.speedUp(a);
        System.out.print("Enter the value to decrese by:");
        a = s.nextInt();
        c1.applyBrakes(a);

        System.out.println("Car present state :");
        c1.printStates();

    }
}