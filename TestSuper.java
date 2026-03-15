import java.util.Scanner;

class Vehicle {
    int maxSpeed = 120;  
    int minSpeed = 40; 
}

class Car extends Vehicle {
    int maxSpeed; 
    int minSpeed;  

    Car(int maxSpeed, int minSpeed) {
        this.maxSpeed = maxSpeed; 
        this.minSpeed = minSpeed;  

    }

    void display() {
        System.out.println("Maximum Speed from Base class (Vehicle): " + super.maxSpeed);
        System.out.println("Minimun Speed from Base class (Vehicle): "+super.minSpeed);
        System.out.println("Maximum Speed from Subclass (Car): " + maxSpeed);
        System.out.println("minimum Speed from SubClass (Car): "+minSpeed);
    }
}

public class TestSuper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxSpeed = sc.nextInt();
        int minSpeed = sc.nextInt();  

        Car c = new Car(speed);
        c.display();
    }
}