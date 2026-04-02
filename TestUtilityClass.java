import java.time.*;
import java.time.format.*;
class TestUtilityClass{
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: "date);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: "time);

        LocalDateTime both = LocalDateTime.now();
        System.out.println(both);

        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);
    }
}