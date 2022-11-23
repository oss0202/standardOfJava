package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorEx01 {
    public List<String> externalIterator(List<MyStudent> myStudentList){
        List<String> highScoreStudentNm = new ArrayList<>();
        Iterator<MyStudent> iterator = myStudentList.iterator();
        while (iterator.hasNext()){
            MyStudent myStudent = iterator.next();
            if(myStudent.getScore() > 70){
                highScoreStudentNm.add(myStudent.getName());
            }
        }
        return highScoreStudentNm;
    }
    public List<String> internalIterator(List<MyStudent> myStudentList){
        return myStudentList.stream()
                .filter(student -> student.getScore() > 70)
                .map(MyStudent::getName)
                .collect(Collectors.toList());
    }
}

