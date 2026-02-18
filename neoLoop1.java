import java.util.Scanner;

public class neoLoop1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no.: ");
        int n = sc.nextInt();

        int product = 1, count = 0;
        while(n>0){
            int digit = n % 10;

            if(digit % 2 != 0){
                product = product * digit;
                count++;
            } 
            n = n / 10;
        }
        if (count == 0){
            System.out.println("No digit found");
        }
        else{
            System.out.println("Multiplication of odd: "+product);
        }

    }
}