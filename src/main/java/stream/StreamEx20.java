package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEx20 {
	/**
	 * 학생들의 점수배열을 리턴
	 * @param myStudentList
	 * @return
	 */
	public List<Integer> getScores(List<MyStudent> myStudentList){
		return myStudentList.stream()
				.map(myStudent -> myStudent.getScore())
				.collect(Collectors.toList());
	}
}
