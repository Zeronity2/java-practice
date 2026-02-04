import java.util.*;

public class Array{
    public static void main(String[] args){

        // array = a collection of value of the same data type

       Scanner sc = new Scanner(System.in);

       String[] foods ;
       int size;

       System.out.print("What # of food do you want?: ");
       size = sc.nextInt();
       sc.nextLine();

       foods = new String[size];


       for(int i = 0; i< foods.length; i++){
        System.out.print("Enter a food: ");
        foods[i] = sc.nextLine();
       }

       for(String food : foods){
        System.out.println(food);
       }

sc.close();

    }
}