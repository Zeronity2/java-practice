import java.util.Scanner;

public class neoLoop3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        int sum = 0;
        
        do{
            int digit = temp % 10;
            sum = sum + digit;
            count ++;
            temp = temp / 10;
        }while(temp != 0);

        if(sum == count){
            System.out.println("yes sum is equal to no. of digit");
        }
        else{
            System.out.println("No sum is not equal to no. of digit");
        }
    }
}