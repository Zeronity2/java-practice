import java.util.*;

public class palidrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num;
        int rev = 0;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if(num == rev){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not Palidrome");
        }
    }
}