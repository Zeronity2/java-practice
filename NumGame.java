import java.util.Random;
import java.util.Scanner;

public class NumGame{
    public static void main(String[] args){

        // NUMBER GUESSING GAME

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min = 1;
        int max = 100;
        int randomNumber = rd.nextInt(min, max);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n: ",min,max);

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! the number was "+randomNumber);
                System.out.println("# of attempts: "+attempts);
            }

        }while(guess != randomNumber);
         
        sc.close();
    }
}