import java.util.Scanner;

public class hypotenuse{
    public static void main(String[] args){

        //  HYPOTENUSE c = Math.sqrt(a^2 + b^2) 
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double c;

    System.out.print("Enter the length of side A: ");
    a = sc.nextDouble();

     System.out.print("Enter the length of side B: ");
    b = sc.nextDouble();

    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("Hypotenuse: "+c+" cm");

    sc.close();
    }
}  