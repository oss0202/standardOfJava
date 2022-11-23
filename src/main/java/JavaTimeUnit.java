import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTimeUnit {
    public static void main(String[] args) {
        List<InterfaceDaemonExeDto> interfaceDaemonExeDtoList = new ArrayList<>();
        //실제로는 Mongo DB 조회
//        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("3526").ifId("01-01").invkApi("/logis-sfc1/spc-command/log-accum").maiApiYn("N").repocYn("N").invkTgt("WMS").build());
//        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("3526").ifId("01-02").invkApi("/logis-sfc2/spc-command/log-accum").maiApiYn("N").repocYn("N").invkTgt("WMS").build());

        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-03").invkApi("/logis-sfc3/inv-aommand/whin-rcmd-flo").maiApiYn("Y").repocYn("Y").invkTgt("WMS").build());
        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-04").invkApi("/logis-sfc4/inv-aommand/whin-rcmd-flo").maiApiYn("Y").repocYn("Y").invkTgt("WMS").build());

        InterfaceDaemonExeDto requestDto = InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-03").build();

//        interfaceDaemonExeDtoList.stream().forEach(System.out::println);
        String automtCntrCd = requestDto.getAutomtCntrCd();
        String ifId = requestDto.getIfId();
        System.out.println(automtCntrCd);
        System.out.println(ifId);

        System.out.println();

        interfaceDaemonExeDtoList.stream().forEach(interfaceDaemonExeDto -> {
            System.out.println(interfaceDaemonExeDto.toString());
            System.out.println(!interfaceDaemonExeDto.getAutomtCntrCd().equals(automtCntrCd));
            System.out.println(!interfaceDaemonExeDto.getIfId().equals(ifId));
            System.out.println(!interfaceDaemonExeDto.getAutomtCntrCd().equals(automtCntrCd) && !interfaceDaemonExeDto.getIfId().equals(ifId));
//            if (!interfaceDaemonExeDto.getAutomtCntrCd().equals("2526") && !interfaceDaemonExeDto.getIfId().equals("01-03")) {
                if(
                        !(interfaceDaemonExeDto.getAutomtCntrCd().equals(automtCntrCd)
                        && interfaceDaemonExeDto.getIfId().equals(ifId))){
//                    System.out.println(interfaceDaemonExeDto);
            }
        });

//        List<String> stringList = new ArrayList<>();
//        stringList.add("http://127.0.0.1:8080");
//        stringList.add("http://127.0.0.1:8081");
//        stringList.add("http://127.0.0.1:8082");
//        stringList.add("http://127.0.0.1:8083");


//
//        String currentServer = "127.0.0.1:8080";
//
//        stringList.stream().filter(s -> !s.contains(currentServer)).forEach(System.out::println);

//        String str = "abcde";
//        byte[] bytes = str.getBytes();
//        System.out.println(new String(bytes));
//        Long aLong = TimeUnit.SECONDS.toMillis(1);
//        Long aLong2 = TimeUnit.SECONDS.toSeconds(1);
//        System.out.println(aLong);
//        System.out.println(aLong2);
//        List<String> stringList = new ArrayList<>();
//        stringList.add("123");
//
//        List<String> stringList2 = new ArrayList<>();
//        stringList2.add("123");
//        stringList2.add("124");
//
//        System.out.println(stringList2.contains(stringList.get(0)));
//        Map<String, String> map = new HashMap<>();
//        boolean b = map.get("test") == null;
//        System.out.println(b);
    }
}
