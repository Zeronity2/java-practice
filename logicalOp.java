import java.util.Scanner;

public class logicalOp{
    public static void main(String[] args){

        // && = AND
        // || = OR 
        // ! = NOT 
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the temperature: "); 
       double temp = sc.nextDouble();

       System.out.print("Weather is sunny or cloudy (true/false): ");
       boolean isSunny = sc.nextBoolean();

       if(temp < 30 && temp <= 0 && isSunny){
        System.out.println("The weather is Good ");
        System.out.println("It is sunny outside");
       }
       else if(temp <= 25 && temp >= 0 && !isSunny){
        System.out.println("The temperature is GOOD ");
        System.out.println("It is CLOUDY outside");
       }
       else if(temp > 30 || temp < 0){
        System.out.println("The weather is bad");
       }
       else{
        System.out.println("It is rainy outside");
       }

    }
}