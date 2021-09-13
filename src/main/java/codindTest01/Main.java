package codindTest01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println('R');
//        System.out.println('P');
//        System.out.println('S');

//        String play = "R";
//        String myPlay = "R";
        int winSco = 2;
        int drSco = 1;
        int loseSco = 0;


        int resultScore = 0;

        // 이기고 지는 기준 : 내가 낸거 기준
        // 배열에서 인자를 꺼내는 작업을 최소화 하기 위해서 주어진 수를 기준으로 계산
        String RPSString = "RSPRS";
        String myPlay = "R";
        String[] strings = RPSString.split("");
        int result = Arrays.stream(strings)
                .map(s -> Main.getScore(myPlay, s))
                .reduce(0, Integer::sum);
        System.out.println(result);


    }

    public static int getScore(String myPlay, String yourPlay){
//        String play = "R";
//        String myPlay = "R";

        String Rock = "R";
        String Paper = "P";
        String Scissors = "S";
        int curScore = 0;

        //주어진변수 바위
        if(yourPlay.equals(Rock))
        {
            if(myPlay.equals(Rock))//바위-바위 비김
            {
                curScore= 1;
            }
            if(myPlay.equals(Scissors))//바위-가위 짐
            {
                curScore= 0;
            }
            if(myPlay.equals(Paper))//바위-보 이김
            {
                curScore= 2;
            }
        }

        //주어진변수  가위
        if(yourPlay.equals(Scissors)) {
            if(myPlay.equals(Rock))//가위-바위 이김
            {
                curScore= 2;
            }
            if(myPlay.equals(Scissors))//가위-가위 비김
            {
                curScore= 1;
            }
            if(myPlay.equals(Paper))//가위-보 짐
            {
                curScore= 0;
            }
        }
        //주어진변수 보
        if(yourPlay.equals(Paper)) {
            if(myPlay.equals(Rock))//보-바위 짐
            {
                curScore= 0;
            }
            if(myPlay.equals(Scissors))//보-가위 이김
            {
                curScore= 2;
            }
            if(myPlay.equals(Paper))//보-보 비김
            {
                curScore= 1;
            }
        }

        return curScore;
    }
}
