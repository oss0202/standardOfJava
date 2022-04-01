package stream;

import java.util.stream.Stream;

public class StreamIterateEx1 {
	public static void main(String[] args) {
		/**
		 * Java9에서는 추가로 스트림 종료 조건을 인자로 받는 iterate() 메서드가 Stream 클래스에 추가되었습니다.
		 * - 파라미터(3개)
		 * 	- 첫번째 파라미터는 초기 값
		 * 	- 두번째 파라미터는 종료 조건을 나타내는 람다 함수
		 *  - 세번째 파라미터는 값이 어떻게 변경될지를 나타내는 람다 함수
		 */
		int sum = Stream.iterate(0, i -> i < 10, i -> i + 1)
				.filter(i -> i % 2 == 1)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("합: " + sum); // 합: 25

		Stream<Integer> stream
				= Stream.iterate(1,
				i -> i <= 20, i -> i * 2);

		// print Values
		stream.forEach(System.out::println);
//		System.out.println(System.getProperty("java.version"));

	}
}
