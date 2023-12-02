package azeem.play.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InDateMethods {
    String _dateString;

    public InDateMethods(String dateString) {
        _dateString = dateString;
    }

    public LocalDate inLocalDate() {
        return LocalDate.parse(_dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public java.util.Date inUtilDate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(_dateString);
    }

    public LocalDateTime inLocalDateTime() {
        return inLocalDate().atStartOfDay();
    }
}
