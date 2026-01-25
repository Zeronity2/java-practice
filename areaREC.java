import java.util.Scanner;

public class areaREC{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = scanner.nextInt();

        System.out.print("Enter breadth: ");
        int b = scanner.nextInt();

        System.out.println("Area of rectangle: "+(l*b));
    }
}