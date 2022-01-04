package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*how to get week number from a date
* */

public class WeekNumbers {

    public static void main(String[] args) throws ParseException {
        String time = "29.10.1098";
        String format = "dd.MM.yyyy";
        SimpleDateFormat df = new SimpleDateFormat(format);
        Date date = df.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(weekNumber);
    }
}
