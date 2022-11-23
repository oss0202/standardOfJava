import java.util.List;
import java.util.Optional;

/**
 * @author : 221213
 * @date : 2022. 11. 08
 */
public class OptionalTest {
	public static void main(String[] args) {
		String str = "1111, 222, 333";
		List<String> strList = List.of(str.replaceAll(" ", "").split(","));
//		System.out.println(str.replaceAll(" ", ""));
//		System.out.println(strList);
//		strList.stream().forEach(System.out::println);

		List<String> sampleList = List.of("999","999","999");
		System.out.println(sampleList);
		sampleList.stream().forEach(System.out::println);

//		SampleCommandDto sampleCommandDto = new SampleCommandDto();
//		sampleCommandDto.setSampleName(null);
//		System.out.println("".equals(sampleCommandDto.getSampleName()));
//		sampleCommandDto.setSampleName(null);
//		System.out.println(StringUtils.isBlank(sampleCommandDto.getSampleName())?"11":"11");
//		System.out.println(Optional.ofNullable(sampleCommandDto.getSampleName()).orElseGet(() -> "비었다."));
//		System.out.println("".equals(sampleCommandDto.getSampleName()) ? sampleCommandDto.getSampleName() : "비었음");
	}
}
