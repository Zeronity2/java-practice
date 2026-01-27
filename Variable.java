//  variable = a reusable container for a getValue 
// primitive = a simple value directly stored in memory(stack)
// reference = memory address that points to the (heap)

public class Variable{
    public static void main(String[] args){
        int age; //declaration
        age = 20; //assignment

        int year = 2026;
        int quantity = 4; 
        
        double price = 19.99;

        char grade = 'A';
        char symbol = '$';

        boolean isStudent = true; //give true false output

        String name = "Khushi";


        System.out.println("my age is "+age);//int
        System.out.println("the year is :"+year);//int
        System.out.println("the price is :"+price);//double
        System.out.println("grades are :"+grade);//charr
       
        if(isStudent){
            System.out.println("Your are a student!");//for boolean variable
        }
        else{
            System.out.println("You are not a student");
        }

        System.out.println("hello my name is "+name);//string
    }
}     