import java.util.Scanner;

public class areaREC{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        double b = scanner.nextDouble();

        double area = (l*b);

        System.out.println("Area of rectangle: "+area);
        scanner.close();
    }
}