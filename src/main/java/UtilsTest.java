import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author : 221213
 * @date : 2023. 03. 23
 */
public class UtilsTest {
	public static void main(String[] args) {
		//		List<String> stringList = new ArrayList<>();
		//		stringList.add("1111");
		//		if (stringList.isEmpty()) {
		//			System.out.println("비었다.");
		//		} else {
		//			System.out.println("안 비었다.");
		//		}
		//		int SbWhoutLineCelCnt = 30;
		//		int whoutToteQty = 18;
		//
		//		int startCelBarcdNo = SbWhoutLineCelCnt - whoutToteQty + 1;
		//		int endCelBarcdNo = SbWhoutLineCelCnt;
		//		System.out.println("startCelBarcdNo ::: " + startCelBarcdNo + ", endCelBarcdNo ::: " + endCelBarcdNo);

		//		int whoutToteQty = 0;
		//
		//		List<ShppSbCelMpng> shppSbCelMpngList = new ArrayList<>();
		//		for (int i = 1; i < 31; i++) {
		//			shppSbCelMpngList.add(ShppSbCelMpng.builder().automtCntrCd("2550").sbCelBarcd("SEQ-A1-" + String.format("%02d", 31 - i) + "-01-01").taskTypeDtlCd("12").sbEqpmnLineNo("SEQ-A1").sbCelEqpmnPstCd("01").sbInptOrdr(String.valueOf(i)).build());
		//		}
		//
		//		whoutToteQty = 18;
		//
		//		final int finalWhoutToteQty = whoutToteQty;
		//		shppSbCelMpngList.stream()
		//				.filter(shppSbCelMpng -> Integer.parseInt(shppSbCelMpng.getSbInptOrdr()) <= finalWhoutToteQty)
		//				.collect(Collectors.toList()).forEach(System.out::println);

		/**
		 * 배송예약일자 오늘, 어제
		 */
		//		System.out.println("::::::::::::::::::::::::: 배송예약일자 S :::::::::::::::::::::::::");
		//		String preDay = LocalDateTime.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		//		String nowDay = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		//		System.out.println(preDay);
		//		System.out.println(nowDay);
		//		String shppDate = preDay + ","+ nowDay;
		//		System.out.println(shppDate);
		//		System.out.println("::::::::::::::::::::::::: 배송예약일자 E :::::::::::::::::::::::::");
		//		System.out.println("::::::::::::::::::::::::: 슈트작업률계산 S :::::::::::::::::::::::::");
		//		int sorterClsCnt = 2900;
		//		int sbWhoutCmpl = 3000;
		//		int shortCutCls = 0;
		//		System.out.println((double) sorterClsCnt / (sbWhoutCmpl + shortCutCls));
		//		System.out.println(Math.round(100 * sorterClsCnt / (sbWhoutCmpl + shortCutCls)));
		//		System.out.println(Math.round(10.6));
		//
		//		System.out.println("::::::::::::::::::::::::: 슈트작업률계산 E :::::::::::::::::::::::::");
		//
		//		String[] arr = {"11", "33"};
		//		System.out.println(arr.length);
		List<Sample> sampleList = new ArrayList<>();
		sampleList.add(Sample.builder().name("변천석22").score(50).build());
		//		sampleList.add(Sample.builder().name("변천석11").score(50).build());
		//		sampleList.add(Sample.builder().name("문형규").score(40).build());
		sampleList.add(Sample.builder().name("오성식").score(40).build());
		sampleList.add(Sample.builder().name("오성식").score(40).build());
		sampleList.add(Sample.builder().name("오성식").score(40).build());
		sampleList.add(Sample.builder().name("오성식").score(40).build());
		//		sampleList.add(Sample.builder().name("김은미").score(40).build());

		//		Sample sample = sampleList.stream().sorted(Comparator.comparing(Sample::getScore).reversed().thenComparing(Sample::getName)).findFirst().orElseGet(() -> null);
		//		System.out.println(sample);

		//		long SampleCnt = sampleList.stream().map(Sample::getName).distinct().count();
		//		System.out.println(SampleCnt > 1);

		List<ShppDircBox> shppDircBoxList = new ArrayList<>();
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D111").shppBoxSeq("00101").shppCarLoadngOrdr(1L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D111").shppBoxSeq("00102").shppCarLoadngOrdr(1L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D111").shppBoxSeq("00103").shppCarLoadngOrdr(1L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D222").shppBoxSeq("00101").shppCarLoadngOrdr(2L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D222").shppBoxSeq("00102").shppCarLoadngOrdr(2L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D333").shppBoxSeq("00101").shppCarLoadngOrdr(3L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D333").shppBoxSeq("00102").shppCarLoadngOrdr(3L).build());
		shppDircBoxList.add(ShppDircBox.builder().shppNo("D333").shppBoxSeq("00103").shppCarLoadngOrdr(3L).build());

		List<ShppDircBox> shppDircBoxListBySortCmpl = shppDircBoxList.stream().sorted(Comparator.comparing(ShppDircBox::getShppCarLoadngOrdr).thenComparing(ShppDircBox::getShppNo).thenComparing(ShppDircBox::getShppBoxSeq)).collect(Collectors.toList());
		//		shppDircBoxListBySortCmpl.stream().forEach(System.out::println);
		String[] chuteArr = {"CH01-13", "CH01-14"};
		int divCnt = shppDircBoxList.size() + (shppDircBoxList.size() % 2 == 1 ? 1 : 0);

		for (int i = 0; i < shppDircBoxList.size(); i++) {
			System.out.println(shppDircBoxList.get(i).toString() + "::::::" + chuteArr[i / (divCnt / 2)]);
		}

		//		String test = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		//		System.out.println(test);
		//		SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMdd");
		//		String shppDate;
		//		try {
		//			Date parse = inFormat.parse(shppRsvtDt);
		//			calendar.setTime(parse);
		//			calendar.add(Calendar.DATE, -1);
		//			shppDate = outFormat.format(calendar.getTime()) + "," + shppRsvtDt;
		//			calendar.setTime(parse);
		//			calendar.add(Calendar.DATE, 1);
		//			shppDate = shppDate + "," + outFormat.format(calendar.getTime());
		//		} catch (ParseException e) {
		//			throw new RuntimeException(e);
		//		}


		//		for (int i = 0; i < 60; i++) {
		//			System.out.println("i :::::: " + i + ", i/30 :::::: " + i/(60/2));
		//		}
	}

	@ToString
	@Getter
	@Builder
	public static class Sample {
		private String name;
		private int score;
	}


	@ToString
	@Getter
	@Builder
	public static class ShppDircBox {
		private String shppNo;
		private String shppBoxSeq;
		private Long shppCarLoadngOrdr;
	}
}
