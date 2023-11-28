package azeem.play.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static java.sql.Date of(String dateString) {
        return java.sql.Date.valueOf(
                LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
