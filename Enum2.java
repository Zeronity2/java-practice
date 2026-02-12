import java.util.Scanner;

enum Day{SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class Enum2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the day: ");
        String input = sc.nextLine().trim().toUpperCase();

        try{
            Day choice = Day.valueOf(input);
            switch(choice){
                
                case SUNDAY:
                    System.out.println("MONDAY");
                    break;
                case MONDAY:
                    System.out.println("TUESDAY");
                    break;
                case TUESDAY:
                    System.out.println("WEDNESDAY");
                    break;
                case WEDNESDAY:
                    System.out.println("THURSDAY");
                    break;
                case THURSDAY:
                    System.out.println("FRIDAY");
                     break;
                case FRIDAY:
                    System.out.println("SATURDAY");
                    break;
                case SATURDAY:
                    System.out.println("SUNDAY");
                    break;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}