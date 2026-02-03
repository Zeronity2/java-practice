 import java.util.Scanner;
  
public class Methods{
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called()
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the age: ");
       int age = sc.nextInt();
     
     if(ageCheck(age)){
        System.out.println("You are eligible for voting!");
     }
     else{
        System.out.println("You are not eligible for voting!");
     }



    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}