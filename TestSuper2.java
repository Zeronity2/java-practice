import java.util.Scanner;

class Vehicle {
    int maxSpeed;

    Vehicle() {
        maxSpeed = 120;
    }
}

class Car extends Vehicle {
    int carSpeed;

    Car(int carSpeed) {
        super(); 
        this.carSpeed = carSpeed;
    }

    void display() {
        System.out.println("Maximum Speed from Base class (Vehicle): " + super.maxSpeed);
        System.out.println("Maximum Speed from Subclass (Car): " + carSpeed);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt(); 

        Car c = new Car(speed);
        c.display();
    }
}