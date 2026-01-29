import java.util.Scanner;

public class CIcalculator{
    public static void main(String[] args){

        // compound interest calculator
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = sc.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the # of years: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %.2f ",years , amount );

        sc.close();
    }
}