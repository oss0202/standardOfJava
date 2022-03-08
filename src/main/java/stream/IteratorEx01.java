package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx01 {
    public void externalIterator(List<MyStudent> menu){
        List<String> highScoreStudentNm = new ArrayList<>();
        Iterator<MyStudent> iterator = menu.iterator();
        while (iterator.hasNext()){
            MyStudent myStudent = iterator.next();
            if(myStudent.getScore() > 70){
                highScoreStudentNm.add(myStudent.getName());
            }
        }
    }
}
