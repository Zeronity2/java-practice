import java.util.Scanner;//for user input variables

public class Input{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //to read the string 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();//to read int

        System.out.print("Whats your gpa: ");
        double gpa = scanner.nextDouble();//to read double

        System.out.print("Are you student? (true/false) :");
        boolean student = scanner.nextBoolean();//to raed boolean

        System.out.println("Hello "+name);
        System.out.println("You are "+age +" years old");
        System.out.println("Your gpa is "+gpa);
        System.out.println("I am a student: "+student);

        scanner.close();
    }
}