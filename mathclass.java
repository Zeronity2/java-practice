import java.util.Scanner;

public class mathclass{
    public static void main(String[] args){

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        double result;

        // result = Math.pow(2, 4);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.14);
        // result = Math.ceil(3.14);
        // result = Math.floor(3.99);
        // result = Math.max(10, 20);

        result = Math.min(a, b);

        System.out.println(result);
    }
}