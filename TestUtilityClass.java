import java.time.*;
class TestUtilityClass{
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime both = LocalDateTime.now();
        System.out.println(both);

        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);
    }
}