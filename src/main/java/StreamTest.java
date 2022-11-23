import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<InterfaceDaemonExeDto> interfaceDaemonExeDtoList = new ArrayList<>();
        //실제로는 DB조회
        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-01").invkApi("/logis-sfc/inv-aommand/whin-rcmd-flo").maiApiYn("Y").repocYn("N").build());
        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-02").invkApi("/logis-sfc/inv-aommand/inv-add").maiApiYn("N").repocYn("Y").build());
        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-03").invkApi("/logis-wms/mvmt-service/item-mvmt").maiApiYn("N").repocYn("Y").build());
        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-04").invkApi("/logis-wms/common-service/critn-code").maiApiYn("N").repocYn("Y").build());
        interfaceDaemonExeDtoList.add(InterfaceDaemonExeDto.builder().automtCntrCd("2526").ifId("01-05").invkApi("/logis-sfc/spc-command/log-accum").maiApiYn("N").repocYn("N").build());

        interfaceDaemonExeDtoList.stream().forEach(interfaceDaemonExeDto -> {
            interfaceDaemonExeDto.setAutomtCntrCd("2222");
        });

        interfaceDaemonExeDtoList.stream().forEach(System.out::println);

//        int ipIndex = 1+1;
//        System.out.println("interfaceDaemonExeDtoList의 사이즈 : " + interfaceDaemonExeDtoList.size());//5개
//
//        interfaceDaemonExeDtoList.stream().forEach(interfaceDaemonExeDto -> {
//            System.out.println("현재 인덱스 : " + (interfaceDaemonExeDtoList.indexOf(interfaceDaemonExeDto) + 1));
//            System.out.println((interfaceDaemonExeDtoList.indexOf(interfaceDaemonExeDto) + 1) % ipIndex);
//            if((interfaceDaemonExeDtoList.indexOf(interfaceDaemonExeDto) + 1) % ipIndex == ipIndex-1){
//                System.out.println("얘는 실행한다.");
//            }
//        });

//        String automtCntrCd = null;
//        interfaceDaemonExeDtoList.stream()
//                .filter(interfaceDaemonExeDto -> {
//                    if(automtCntrCd==null||automtCntrCd.equals(null)){
//                        return true;
//                    }else {
//                        return interfaceDaemonExeDto.getAutomtCntrCd().equals(automtCntrCd);
//                    }
//                }).forEach(System.out::println);
    }
}
