package azeem.play.models;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class World implements BoundToTime {
    private Calendar _calendar;
    private List<BoundToTime> _boundToTimeObservers = new ArrayList<>();

    public World(LocalDate startDate) {
        _calendar = Calendar.getInstance();

        // Convert LocalDate to Date
        Date startDateAsDate = java.sql.Date.valueOf(startDate);

        _calendar.setTime(startDateAsDate);

        addDayPassedObserver(this);
    }

    public LocalDateTime currentDateTime() {
        return LocalDateTime.ofInstant(_calendar.toInstant(), _calendar.getTimeZone().toZoneId());
    }

    public void addDayPassedObserver(BoundToTime boundToTimeObserver) {
        _boundToTimeObservers.add(boundToTimeObserver);
    }

    private void broadcastDayPassedEvent() {
        for (BoundToTime event : _boundToTimeObservers) {
            event.onDayPassed();
        }
    }

    public void passTheDay() {
        broadcastDayPassedEvent();
    }

    public WorldPassTime pass(double time) {
        return new WorldPassTime(time);
    }

    @Override
    public void onDayPassed() {
        _calendar.add(Calendar.DAY_OF_MONTH, 1);
    }

    public class WorldPassTime {
        double _time;

        public WorldPassTime(double time) {
            _time = time;
        }

        public void days() {
            int days = (int) _time;

            for (int day = 0; day < days; day++) {
                passTheDay();
            }
        }

    }

}
