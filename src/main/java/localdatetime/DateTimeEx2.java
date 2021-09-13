package localdatetime;

import java.util.Calendar;
import java.util.Date;

public class DateTimeEx2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.JANUARY, 1);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int wedDay = calendar.get(Calendar.WEDNESDAY);
        System.out.println(dayOfWeek);
        System.out.println(wedDay);
        //assertThat(dayOfWeek).isEqualTo(Calendar.WEDNESDAY);
        //assertThat(dayOfWeek).isEqualTo(4);
        Date theDate = calendar.getTime();
        System.out.println(theDate);
        //assertThat(theDate.getDay()).isEqualTo(3);
    }
}
