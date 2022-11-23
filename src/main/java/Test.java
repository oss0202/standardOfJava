import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        int a = 2;
//        System.out.println(a++);
//        Map<String, String> map = new HashMap<>();
//        map.put("test1", "111");
//        map.put("test2", "222");
//        map.remove("test2");
//
//        System.out.println(map);
//        System.out.println(LocalDateTime.now());
////        Thread.sleep(1000);
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        System.out.println("0x47494643\\u003d");
//        List<String> strings = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            strings.add(i + "번째");
//        }
//
//        System.out.println(String.join(",", strings));
//
//        System.out.println(String.format("%s 치환할래욤", "ㅁㅁ")); //-> ㅁㅁ 치환할래욤

//        System.out.println(LocalDateTime.now());
        String  wwww = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        Long  firstTime = ZonedDateTime.of(LocalDateTime.parse(wwww), ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(firstTime);
        Thread.sleep(3000);
//        String secondTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        Long secondTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(secondTime);

//        System.out.println(Duration.between(firstTime, secondTime).getNano());
//        System.out.println(TimeUnit.MILLISECONDS.convert(Duration.between(firstTime, secondTime).getNano(), TimeUnit.NANOSECONDS));
        System.out.println(secondTime-firstTime);
    }

    private String testLogger(String msg, String value) {
        return "ok";
    }
}
