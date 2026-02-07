import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
// Enum = A special data type that stores a fixed set of constants

public class Enum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Day today = Day.MONDAY;
        System.out.println("Today is: "+today);


        System.out.println("\nAll Days:");
        for(Day d : Day.values()){
            System.out.println(d);
        }


        System.out.print("\nEnter a day: ");
        String input = sc.nextLine().toUpperCase();

        // converting string to enum
        Day choice = Day.valueOf(input);

        switch (choice) {

            case MONDAY:
                System.out.println("Start of week");
                break;

            case FRIDAY:
                System.out.println("Weekend is near!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Normal working day");
        }

        System.out.println("Position: "+choice.ordinal());

        System.out.println("Enum name: "+choice.name());

    }
}