import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int original = n;
        int sum =0 , count = 0;

        int temp = n;
        while(temp > 0){
            count ++;
            temp /= 10;
        }

            while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }

        if(sum == original)
            System.out.println("Armstrong number!");
        else
            System.out.println("Not Armstrong number!");

    }
}