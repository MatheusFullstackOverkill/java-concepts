import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main() {
        // Main date classes

        // LocalDate - Represents a date (year, month, day (yyyy-MM-dd)).
        LocalDate date = LocalDate.now();

        // LocalTime - Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns)).
        
        LocalTime time = LocalTime.now();
        // LocalDateTime - Represents both a date and a time.
        LocalDateTime localDateTime = LocalDateTime.now();

        // Get current date time in UTC.
        Instant UTCDateTime = Instant.now();

        // DateTimeFormatter - Formatter for displaying and parsing date-time objects.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedLocalDateTime = dateTimeFormatter.format(localDateTime);

        System.out.println(date);
        System.out.println(time);
        System.out.println(localDateTime);
        System.out.println(UTCDateTime);
        System.out.println(formattedLocalDateTime);
    }
}