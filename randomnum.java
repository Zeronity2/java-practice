import java.util.Random;

public class randomnum{
    public static void main(String[] args){

        Random random = new Random();

        int number = random.nextInt(1, 6);
        int digit = random.nextInt(33,77);
         
        // double number = random.nextBoolean();

        System.out.println(number);
    }
}