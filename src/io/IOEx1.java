package io;

import java.util.Date;

public class IOEx1 {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();

        System.out.printf("문자 %c의 코드는 %d\n", i, i);
        System.out.printf("%d는 8진수로 %o, 16진수로 %x\n", i, i, i);

        System.out.printf("%.3f\n", f);
        System.out.printf("%08.1f\n", f);

        System.out.printf("%tR\n", d);
        System.out.printf("%tH시 %tM분\n", d, d);
    }
}
