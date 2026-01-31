import java.util.java;

public class enhSwitch{
    public static void main(String[] args){

        // enhanced switch = A replacement to many elseif statements
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine();


        switch(day){
            case "Monday" -> System.out.println("It is a weekday(:"); 
            case "Tuesday" -> System.out.println("It is a weekday(:");
            case "Wednesday" -> System.out.println("It is a weekday(:");
            case "Thursday" -> System.out.println("It is a weekday(:");
            case "Friday" -> System.out.println("It is a weekday(:");
            case "Saturday" -> System.out.println("It is a weekend:)");
            case "Sunday" -> System.out.println("It is a weekend:)");
        }
        

    }
}