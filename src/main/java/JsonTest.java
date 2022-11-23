

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JsonTest {
    public static <T>void main(String[] args) throws IOException {
//        InterfaceDaemonExeDto interfaceDaemonExeDto1 = InterfaceDaemonExeDto.builder()
//                .automtCntrCd(\"11\")
//                .ifId(\"12\")
//                .repocYn(\"Y\")
//                .build();
//
//        InterfaceDaemonExeDto interfaceDaemonExeDto2 = InterfaceDaemonExeDto.builder()
//                .automtCntrCd(\"11\")
//                .ifId(\"12\")
//                .repocYn(\"Y\")
//                .build();
//
//        List<InterfaceDaemonExeDto> interfaceDaemonExeDtos = new ArrayList<>();
//        interfaceDaemonExeDtos.add(interfaceDaemonExeDto1);
//        interfaceDaemonExeDtos.add(interfaceDaemonExeDto2);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(interfaceDaemonExeDtos);
//        System.out.println(\"json : \" + json);
//        List<InterfaceDaemonExeDto> interfaceDaemonExeDtos2 = objectMapper.readValue(json, List.class);
//        System.out.println(\"list : \" +  interfaceDaemonExeDtos2);

//        System.out.println(interfaceDaemonExeDto1.equals(interfaceDaemonExeDto2));
//        System.out.println(interfaceDaemonExeDto1==interfaceDaemonExeDto2);
//
//        System.out.println(interfaceDaemonExeDto1.getAutomtCntrCd().equals(interfaceDaemonExeDto2.getAutomtCntrCd()));


//        Map<String, String> stringStringMap = new HashMap<>();
//        System.out.println(stringStringMap.getOrDefault(\"test\", \"1234\"));
//        String str = \"WMS03_012022061312131400000001\".substring(3,8);
//        System.out.println(str);


//        Map<String, Map<String, String>> map = new HashMap<>();
//        Map<String, String> innerMap = new HashMap<>();
//        innerMap.put(\"EXAMCODE\", \"298\");
//        innerMap.put(\"STUDENTID\", \"0718256\");
//        map.put(\"params\",innerMap);
//
//        String result = objectMapper.writeValueAsString(map);
//        System.out.println(\"Map-Map\");
//        System.out.println(result);
//
//
//        Map<String, List<InputParamVO>> map3 = new HashMap<>();
//        List<InputParamVO> inputParamList = new ArrayList<>();
//        inputParamList.add(new InputParamVO(\"EXAMCODE\", \"298\"));
//        inputParamList.add(new InputParamVO(\"STUDENTID\", \"0718256\"));
//        map3.put(\"params\", inputParamList);
//        System.out.println(\"Map-List\");
//        System.out.println(objectMapper.writeValueAsString(map3));


//        Exam00029ReqVo exam00029ReqVo = new Exam00029ReqVo(298);
////        objectMapper.writeValue(exam00029ReqVo);
//
//        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        Exam00029ReqVo ob = objectMapper.readValue(\"{ \\"EXAM_DEG\\" : 298 }\", Exam00029ReqVo.class);
//        System.out.println(ob);/**/
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, Exam00029ReqVo> inputParams = new HashMap<>();
//        inputParams.put(\"params\", new Exam00029ReqVo(298));
//        System.out.println(objectMapper.writeValueAsString(inputParams));
//        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inputParams));

//        String json = \"{ \\"EXAM_DEG\\" : 298 }\";
//        Map<String, Exam00029ReqVo> map = new HashMap<String, Exam00029ReqVo>();
////        map = mapper.readValue(json, new TypeReference<Map<String, Exam00029ReqVo>>(){});
//        map.put(\"params\", new Exam00029ReqVo(298));
//        System.out.println(mapper.writeValueAsString(map));
//        String str = mapper.writeValueAsString(map);
//        List<Integer> integerList = new ArrayList<>();
//        integerList.stream();
//
//        System.out.println(Boolean.parseBoolean(null));


    }
}

