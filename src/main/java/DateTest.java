import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String testDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println(currentDate);
        System.out.println(testDate);
    }
}
