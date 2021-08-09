package lambda;

import java.util.Arrays;

public class LambdaEx1 {
    public static void main(String[] args) {
        int[] ints = new int[5];
        Arrays.setAll(ints, i -> (int)(Math.random()*5+1));
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
