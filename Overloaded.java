import java.util.Scanner;

public class Overloaded {


    public static int calculateFinalPrice(int price, int taxRate) {
        int finalPrice = price + (price * taxRate) / 100;
        return finalPrice;
    }

    public static double calculateFinalPrice(double price, double taxRate) {
        double finalPrice = price + (price * taxRate) / 100.0;
        return finalPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        double m = sc.nextDouble();
        double n = sc.nextDouble();

        
        int intResult = calculateFinalPrice(a, b);
        double doubleResult = calculateFinalPrice(m, n);

        System.out.println(intResult);
        System.out.printf("%.2f", doubleResult);

        sc.close();
    }
}
