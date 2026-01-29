

public class nestedif{
    public static void main(String[] args){

     boolean isStudent = true; //or false
     boolean isSenior = true; // or true
     double price = 9.99;

     if(isStudent){
        if(isSenior){
            System.out.println("you get a senior discount of 20%");
            System.out.println("you get a studnet discount of 10%");
            price = price * 0.7;
        }
        else{
            System.out.println("you get a student discount of 10%");
            price = price * 0.9;
        }

     }
     else{
        if(isSenior){
            System.out.println("you get a senior discount of 20%");
            price = price * 0.8;
        }
        else{
            price = price * 1;
        }

     }
     System.out.printf("The ticket price is : $%.2f",price);

    }
}