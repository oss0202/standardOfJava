package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeEx3 {
    public static void main(String[] args) {
        // 1. LocalDate 생성
//        LocalDate date = LocalDate.of(2021, 9, 3);
//         LocalDateTime date = LocalDateTime.of(2021, 9, 3, 1, 15, 20);
         LocalDateTime date = LocalDateTime.now();
        System.out.println(date); // // 2021-09-03
        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue();
        // 4. 숫자 요일 출력
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.FRIDAY);
        System.out.println(dayOfWeekNumber); // 6

        System.out.println(date.getHour());
        System.out.println(date.getMinute());
        System.out.println(date.getSecond());
    }
}
