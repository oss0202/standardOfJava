package codindTest01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        //배열 내림차순 정렬
        //Max 값 구하기(둘 중에 큰거)
        // 1. 배열 중 Max
        // 2. 배열 길이
//        Integer[] ints = {1,2,1};
//        Integer[] ints = {2,1,4,4};
        int[] ints = {6,2,3,5,6,3};

        int length = ints.length;
        int arrMax = Arrays.stream(ints).max().getAsInt();
        int maxValue = length>arrMax ? length : arrMax;

        //1.리스트 길이만큼 생성
        List<Integer> firList = new ArrayList<>();
        int i = 1;
        for (int j = 1; j <= maxValue; j++) {
            firList.add(j);
        }

        //2.중복된 값들 리스트 생성
        List<Integer> resultList = new ArrayList<>();//중복된 값을 비교하기 위한 리스트
        List<Integer> multiList = new ArrayList<>();//중복된 값 리스트
        for (int a : ints){
            if(!resultList.contains(a)){
                resultList.add(a);
                firList.remove(Integer.valueOf(a));//사용하지 않는 숫자를 확인하기 위해서
            }else{
                multiList.add(a);
//                System.out.println("중복값 : " + a);
            }
        }
        firList.stream().forEach(integer -> System.out.println("사용하지 않는 값" + integer));
        multiList.stream().forEach(integer -> System.out.println("중복된 값 " + integer));

        int multiUse = firList.stream().reduce(0,Integer::sum);
        int notUse = multiList.stream().reduce(0,Integer::sum);
        System.out.println(Math.abs(notUse - multiUse));
    }
}
