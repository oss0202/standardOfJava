import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 221213
 * @date : 2023. 01. 07
 */
public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());

		List<AcntrFrebieDto> acntrFrebieDtoList = List.of(
				new AcntrFrebieDto("2511", "9980000270866", "0000000271472", "20230106")
		 	    ,new AcntrFrebieDto("2511", "9980000270866", "0000000271475", "20230106")
		 	    ,new AcntrFrebieDto("2511", "9980000270866", "0000000271477", "20230106")
		);

		System.out.println("리스트 노출");
		acntrFrebieDtoList.stream().forEach(System.out::println);

		AcntrFrebieDto acntrFrebieDto = acntrFrebieDtoList.stream().max(Comparator.comparing(AcntrFrebieDto::getLogisItemId)).orElse(null);
		System.out.println("물류상품ID값이 제일 큰 녀석");
		System.out.println(acntrFrebieDto);
	}
}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class AcntrFrebieDto{
	private String automtCntrCd;
    private String frebieLogisItemId;
    private String logisItemId;
    private String accumDt;
}
