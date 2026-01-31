import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a ;
        double b ;
        char operator;
        double result = 0;
       
     System.out.print("Enter the first number: ");
     a = sc.nextDouble();

     System.out.print("Enter an operator (+, -, *, /, ^): ");
     operator = sc.next().charAt(0);

     System.out.print("Enter the second number: ");
     b = sc.nextDouble();

     switch(operator){
        case '+' -> result = a + b;
        case '-' -> result = a - b;
        case '*' -> result = a * b;
        case '/' -> result = a / b;
        case '^' -> result = Math.pow(a, b);
     }

     System.out.println(result);
        
      sc.close();
    }
}