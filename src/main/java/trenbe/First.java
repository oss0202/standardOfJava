package trenbe;

import java.util.Arrays;
import java.util.Collections;

public class First {
    public static void main(String[] args) {
        int N = 2613;
    }
    public int solution(int N) {
        String strN = String.valueOf(N);
        Integer[] ints = new Integer[strN.length()];
        for (int i = 0; i < strN.length(); i++)
        {
            ints[i] = strN.charAt(i) - '0';
        }
        Arrays.sort(ints);
        String forwardStr = "";
        for (int i = 0; i < ints.length; i++) {
            forwardStr += ints[i];
        }

        String reverseStr = "";
        Arrays.sort(ints, Collections.reverseOrder());
        for (int i = 0; i < ints.length; i++) {
            reverseStr += ints[i];
        }
        return  Integer.parseInt(forwardStr) + Integer.parseInt(reverseStr);
    }
}
