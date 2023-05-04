import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonListTest {
	public static void main(String[] args) throws IOException {
		String str = "20230223-1030489";
		System.out.println(str.substring(0,8));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYYMMDD")));
//		List<String> strings = List.of("1234","567","123");
//		System.out.println(strings.get(3));
//		StringUtils.

//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));

//		String str =
//				"{\"automtCntrCd\":\"2550\",\"ifId\":\"WCS99_99202302171419543320474\",\"demndIfId\":\"DF\",\"trmsDts\":\"2023-02-17 14:19:54\",\"rstStatCd\":\"0000\",\"rstStatMsg\":\"정상\",\"ifRequestDts\":null,\"ifResponseDts\":null,\"ifApiResponseTimeMs\":null}";
//		Map hashMaps = new ObjectMapper().readValue(str, Map.class);
//		hashMaps.put("aaa", "123123");
//		System.out.println(hashMaps);

		//        List<String> stringList = new ArrayList<>();
		//        stringList.add("1");
		//        stringList.add("2");
		//        stringList.add("3");
		//        stringList.add("4");
		//        stringList.add("5");
		//        stringList.add("6");
		//        stringList.add("7");
		//        stringList.add("8");
		//        stringList.add("9");
		//        stringList.add("10");
		//        stringList.add("11");
		//
		//        /**
		//         * 재실행 API 갯수 / 서버 대수 * 내 서버 순서 ~ 재실행 API 갯수 / 서버 대수 * 내 서버 순서+1
		//         */
		//        int retryCnt = stringList.size();
		//        int nowServerNo = 0;
		//        int serverCnt = 3;
		//        int start = retryCnt/serverCnt*nowServerNo + nowServerNo;
		//        int end = retryCnt/serverCnt*(nowServerNo+1) + nowServerNo;
		//
		//        System.out.println("첫번째 서버 : " + start + " ~ " + end);
		//
		//
		//        nowServerNo = 1;
		//        start = retryCnt/serverCnt*nowServerNo + nowServerNo;
		//        end = retryCnt/serverCnt*(nowServerNo+1) + nowServerNo;
		//        System.out.println("두번째 서버 : " + start + " ~ " + end);
		//
		//        nowServerNo = 2;
		//        start = retryCnt/serverCnt*nowServerNo + nowServerNo;
		//        end = retryCnt/serverCnt*(nowServerNo+1) + nowServerNo;
		//        System.out.println("세번째 서버 : " + start + " ~ " + end);


		//
		//        System.out.println(stringList.size()/3*0);
		//        System.out.println(stringList.size()/3*1);
		//
		//        System.out.println();
		//        System.out.println(stringList.size()/3*1+1);
		//        System.out.println(stringList.size()/3*2+1);
		//
		//        System.out.println();
		//        System.out.println(stringList.size()/3*2+2);
		//        System.out.println(stringList.size()/3*3+2);


		//        String str = "[{\"automtCntrCd\":\"2526\",\"ifId\":\"01-01\",\"invkApi\":\"/logis-sfc/inv-aommand/whin-rcmd-flo\",\"maiApiYn\":\"Y\",\"repocYn\":\"N\"},{\"automtCntrCd\":\"2526\",\"ifId\":\"01-01\",\"invkApi\":\"/logis-sfc/inv-aommand/inv-add\",\"maiApiYn\":\"N\",\"repocYn\":\"Y\"},{\"automtCntrCd\":\"2526\",\"ifId\":\"01-01\",\"invkApi\":\"/logis-wms/mvmt-service/item-mvmt\",\"maiApiYn\":\"N\",\"repocYn\":\"Y\"},{\"automtCntrCd\":\"2526\",\"ifId\":\"01-01\",\"invkApi\":\"/logis-wms/common-service/critn-code\",\"maiApiYn\":\"N\",\"repocYn\":\"Y\"},{\"automtCntrCd\":\"2526\",\"ifId\":\"01-01\",\"invkApi\":\"/logis-sfc/spc-command/log-accum\",\"maiApiYn\":\"N\",\"repocYn\":\"N\"}]";
		//        List<Map<Object,Object>> hashMaps = new ObjectMapper().readValue(str, List.class);
		//        System.out.println(hashMaps);
		//        hashMaps.stream()
		//                .forEach(System.out::println);
		//
		////        Map<Object, Object> ob = new ObjectMapper().readValue("{ \"EXAM_DEG\" : 298 }", Map.class);
		////        System.out.println(ob);
		//
		//        List<HashMap<Object,Object>> sample = new ObjectMapper().readValue("[{ \"EXAM_DEG\" : 298 }]", List.class);
		//        System.out.println(sample);
		//        sample.stream()
		//                .forEach(System.out::println);

		//        String str = "WCS01-0120220626";
		//        System.out.println(str.substring(3,8));
	}
}
