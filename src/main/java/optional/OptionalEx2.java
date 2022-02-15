package optional;

import java.sql.Timestamp;
import java.time.*;

public class OptionalEx2 {
    public static void main(String[] args) {
//        Long ctm = System.currentTimeMillis();
//        System.out.println(ctm);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
        long date = zdt.toInstant().toEpochMilli();

        System.out.println(localDateTime);
        System.out.println("----------");

        System.out.println(date);
        System.out.println("----------");

        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        System.out.println(timestamp.getTime());
        System.out.println("----------");

        LocalDateTime localDateTime1 = timestamp.toLocalDateTime();
        System.out.println(localDateTime1);
        System.out.println("----------");
    }
}
