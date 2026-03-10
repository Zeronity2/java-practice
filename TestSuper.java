import java.util.Scanner;

class Vehicle {
    int maxSpeed = 120;   
}

class Car extends Vehicle {
    int maxSpeed;   

    Car(int speed) {
        this.maxSpeed = speed;   
    }

    void display() {
        System.out.println("Maximum Speed from Base class (Vehicle): " + super.maxSpeed);
        System.out.println("Maximum Speed from Subclass (Car): " + maxSpeed);
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