import java.util.Scanner;

public class areaREC{
    public static void main(String[] args){
        double l = 0;
        double b = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        l = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        b = scanner.nextDouble();
 
        area = (l*b);

        System.out.println("Area of rectangle: "+area);
        scanner.close();
    }
}       