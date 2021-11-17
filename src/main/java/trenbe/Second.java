package trenbe;

import java.time.LocalTime;

public class Second {
    public static void main(String[] args) {
//        String p = "PM 01:00:00";
        String p = "PM 11:59:59";
//        int n = 10;
        int n = 1;

        System.out.println(solution(p, n));

    }

    public static String solution(String p, int n) {
        String[] strings = p.split(" ");
        String apmStr = strings[0];
        String[] times = strings[1].split(":");

        LocalTime targetTime = LocalTime.of((apmStr.equals("PM")?12:0) + Integer.parseInt(times[0]),Integer.parseInt(times[1]),Integer.parseInt(times[2]));
        return String.format(targetTime.plusSeconds(n).toString(), "%tH%tM%tS");
    }
}
