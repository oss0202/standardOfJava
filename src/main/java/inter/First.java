package inter;

public class First {
    public static void main(String[] args) {
//        int speed_limit = 60;
//        int[][] cameras = {{60,1}, {130,2}, {240,4}, {432,7}};
        int speed_limit = 30;
        int[][] cameras = {{60,3}, {152,6}, {240,9}};

        System.out.println(solution(speed_limit, cameras));
    }

    public static int solution(int speed_limit, int[][] cameras) {
        int nowLocation = 0;
        double diffDistance = 0;
        double diffTime = 0;
        int result = 0;
        for (int i = 0; i < cameras.length; i++) {
            diffDistance = cameras[i][0] - nowLocation;
            diffTime = cameras[i][1] - diffTime;

            if(diffDistance/diffTime > speed_limit){
                result++;
            }
            nowLocation = cameras[i][0];
            diffTime = cameras[i][1];
        }
        return result;
    }
}
