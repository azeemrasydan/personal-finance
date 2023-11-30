package azeem.play.models;

import java.sql.Date;
import java.util.Calendar;

public class World {
    private Calendar _calendar;

    public World(Date startDate) {
        _calendar = Calendar.getInstance();
        _calendar.setTime(startDate);
    }

    public Calendar calendar() {
        return _calendar;
    }
}
