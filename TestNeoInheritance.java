import java.util.*;

class Person {
    String name;
    int age;
    double height;
    double weight;

    Person(){}

    Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    float calculateBMI(){
        float BMI = (float)(weight / (height * height));
        return BMI;
    }
}

class Athlete extends Person {
    int exercises;
    double calories;

    Athlete(){}

    Athlete(String name, int age, double height, double weight, int exercises, double calories){
        super(name, age, height, weight);
        this.exercises = exercises;
        this.calories = calories;
    }

    float totalCaloriesBurned(){
        float total = (float)(exercises * calories);
        return total;
    }
}

public class TestNeoInheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String pName = sc.nextLine();
        int pAge = sc.nextInt();
        double pHeight = sc.nextDouble();
        double pWeight = sc.nextDouble();
        sc.nextLine();

        
        String aName = sc.nextLine();
        int aAge = sc.nextInt();
        double aHeight = sc.nextDouble();
        double aWeight = sc.nextDouble();
        int exercises = sc.nextInt();
        double calories = sc.nextDouble();

        Person person = new Person(pName, pAge, pHeight, pWeight);
        Athlete athlete = new Athlete(aName, aAge, aHeight, aWeight, exercises, calories);

        System.out.println("Information for the regular person:");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age + " years");
        System.out.printf("Height: %.2f meters\n", person.height);
        System.out.printf("Weight: %.2f kilograms\n", person.weight);
        System.out.printf("BMI: %.2f\n\n", person.calculateBMI());

        System.out.println("Information for the athlete:");
        System.out.println("Name: " + athlete.name);
        System.out.println("Age: " + athlete.age + " years");
        System.out.printf("Height: %.2f meters\n", athlete.height);
        System.out.printf("Weight: %.2f kilograms\n", athlete.weight);
        System.out.printf("BMI: %.2f\n", athlete.calculateBMI());
        System.out.println("Exercises per day: " + athlete.exercises);
        System.out.printf("Calories burned per exercise: %.2f calories\n", athlete.calories);
        System.out.printf("Total calories burned per day: %.2f\n", athlete.totalCaloriesBurned());
    }
}