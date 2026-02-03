import java.util.Scanner;

public class Overload{
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        System.out.print("Enter forth number: ");
        double d = sc.nextDouble();



        System.out.println("Sum = "+add(a ,b ));
        System.out.println("Sum = "+add(a ,b ,c ));
        System.out.println("Sum = "+add(a ,b ,c ,d));
       
}


    static double add(double a, double b){
        return a + b;
    }
    static double add(double a , double b, double c){
       return a + b + c;
    }
    static double add(double a , double b, double c, double d){
       return a + b + c + d;
    }
}