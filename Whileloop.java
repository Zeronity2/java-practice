import java.util.Scanner;

public class Whileloop{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // while loop is infinite loop
        String response = "";
        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = sc.next().toUpperCase();
        }

         System.out.println("You have quit the game");
        sc.close();
    }
}