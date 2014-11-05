package utils;

import org.joda.time.LocalDateTime;

/**
 * Created by guyk on 11/5/14.
 */
public class DateTimeUtils {


    public boolean ValidateDateTime(LocalDateTime dateTime) {

        LocalDateTime hourLater = dateTime.plusHours(1);
        return (dateTime.getMillisOfDay() - hourLater.getMillisOfDay() >= 3600000 ) ? true : false;
    }
}
