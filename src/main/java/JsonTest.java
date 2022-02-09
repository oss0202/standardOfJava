import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.util.BeanUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) throws IOException {
//        Map<String, Map<String, String>> map = new HashMap<>();
//        Map<String, String> innerMap = new HashMap<>();
//        innerMap.put("EXAMCODE", "298");
//        innerMap.put("STUDENTID", "0718256");
//        map.put("params",innerMap);
//
//        String result = objectMapper.writeValueAsString(map);
//        System.out.println("Map-Map");
//        System.out.println(result);
//
//
//        Map<String, List<InputParamVO>> map3 = new HashMap<>();
//        List<InputParamVO> inputParamList = new ArrayList<>();
//        inputParamList.add(new InputParamVO("EXAMCODE", "298"));
//        inputParamList.add(new InputParamVO("STUDENTID", "0718256"));
//        map3.put("params", inputParamList);
//        System.out.println("Map-List");
//        System.out.println(objectMapper.writeValueAsString(map3));


//        Exam00029ReqVo exam00029ReqVo = new Exam00029ReqVo(298);
////        objectMapper.writeValue(exam00029ReqVo);
//
//        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        Exam00029ReqVo ob = objectMapper.readValue("{ \"EXAM_DEG\" : 298 }", Exam00029ReqVo.class);
//        System.out.println(ob);/**/
//
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Exam00029ReqVo> inputParams = new HashMap<>();
        inputParams.put("params", new Exam00029ReqVo(298));
//        System.out.println(objectMapper.writeValueAsString(inputParams));

//        String json = "{ \"EXAM_DEG\" : 298 }";
//        Map<String, Exam00029ReqVo> map = new HashMap<String, Exam00029ReqVo>();
////        map = mapper.readValue(json, new TypeReference<Map<String, Exam00029ReqVo>>(){});
//        map.put("params", new Exam00029ReqVo(298));
//        System.out.println(mapper.writeValueAsString(map));
//        String str = mapper.writeValueAsString(map);
        List<Integer> integerList = new ArrayList<>();
        integerList.stream();

        System.out.println(Boolean.parseBoolean(null));
    }
}

