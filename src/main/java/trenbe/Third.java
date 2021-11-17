package trenbe;

public class Third {
    public static void main(String[] args) {
//        int[] arr = {2,1,3,1,4,2,1,3};
        int[] arr = {1,2,3};
        int result = solution(arr);
        System.out.println(result);
    }

    public static int solution(int[] arr) {
        int nowNum = 0;
        int diffNum = arr.length;
        for (int i = 0; i < arr.length; i++) {
            nowNum = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(nowNum == arr[j]){
                    if(diffNum > j-i && j-i != 0){
                        diffNum = j - i;
                    }
                }
            }
        }
        return diffNum==arr.length?-1:diffNum;
    }
}
