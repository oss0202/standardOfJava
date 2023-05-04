import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * @author : 221213
 * @date : 2023. 03. 15
 */
public class Wms0315Test {
	public static void main(String[] args) throws IOException {
		//		String json = "{ \"EXAM_DEG\" : 298 }";

		String json =
				"{    \"automtCntrCd\": \"2550\",    \"trmsDts\": \"2023-03-15 06:34:01\",    \"wcsDvicId\": null,    \"shppExpcDt\": \"20230314\",    \"wrkBatchNo\": \"20230314-005-03\",    \"wrkDircDivCd\": \"01\",    \"toteAssgNo\": \"20230314_2426482\",    \"caralcPlanNo\": \"2023031407C0000AB2550\",    \"shpmtClsgDts\": \"2023-03-14 23:33:04\",    \"shppMthdWhoutTypeCd\": \"04\",    \"boxEqpmnLineTypeCd\": \"01\",    \"shppNo\": \"00000255488\",    \"shppBoxSeq\": \"00101\",    \"vrtlRtnrNo\": null,    \"totePickgPrioyRankg\": null,    \"rejectDircYn\": \"N\",    \"astTaskGrpId\": \"0001278997\",    \"astTaskGrpTotItemCnt\": 16,    \"astGrpStrtExpcDts\": \"20230314213432\",    \"astGrpCmplExpcDts\": \"20230314233300\",    \"astPrioyRankg\": 9999,    \"astTaskCtgId\": \"11314\",    \"pickgGrp\": [        {            \"logisItemId\": \"0000000426730\",            \"itemBarcd\": \"1000063825534\",            \"itemNm\": \"이쑤시개 꼬지 요지 산적꽂이 대\",            \"itemImgUrl\": \"http://dev-item.ssgcdn.com/34/55/82/item/1000063825534_i1.jpeg\",            \"dircQty\": 4,            \"bnId\": \"190675\",            \"sellUnitDivNm\": \"낱개\"        },        {            \"logisItemId\": \"0000000389369\",            \"itemBarcd\": \"1000059454697\",            \"itemNm\": \"감자 슬라이서 포테이토 필러 커터물결칼 1개\",            \"itemImgUrl\": \"http://dev-item.ssgcdn.com/97/46/45/item/1000059454697_i1.jpeg\",            \"dircQty\": 2,            \"bnId\": \"196611\",            \"sellUnitDivNm\": \"낱개\"        }    ]}";

		Map<Object, Object> map = new ObjectMapper().readValue(json, Map.class);
		System.out.println("map = " + map);
	}
}
