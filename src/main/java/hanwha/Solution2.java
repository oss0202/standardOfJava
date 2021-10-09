package hanwha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
//        int[] scores = {1,3,7,8,10,15};
        int[] scores = {1,2,3,4,5,6};
        boolean[] visited = new boolean[scores.length];
//        System.out.println(scores.length);

        comb(scores, visited, 0, 3);
        /*
        int result = scores.length;
        System.out.println(result);
         방법
        1. 배열을 나눌 수 있는 경우의 수
        nCr => 중에서 합이 배열의 갯수인것들 추리기

        2. 경우의 수 별로 차이 값의 합 구하기

        3. 최소값의 경우 리턴
         */
    }

    //2. 재귀를 이용해 구현
    static void comb(int[] arr, boolean[] visited, int depth, int r) {
        if(r == 0) {
            print(arr, visited);
            return;
        }
        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, r - 1);

            visited[depth] = false;
            comb(arr, visited, depth + 1, r);
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited) {
        int result = 0 ;
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true){
                System.out.print(arr[i] + " ");
                result += arr[i];
            }
            if(i == arr.length-1){
                if(result == 6){
                    System.out.print(" -> 합산 : " + result);
                }
            }
        }
        System.out.println();
    }
}
