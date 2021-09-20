package tutorial;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        copyFrom[0] = "sss";
//        Arrays.stream(copyTo).forEach(System.out::println);
//        System.out.println("-----------------------------");
//        Arrays.stream(copyFrom).forEach(System.out::println);

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() -
                substring.length();

        String str = "";
//            System.out.println(searchMe.length());
//            System.out.println(max);
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;

            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }else{
                    str = j + ", " + k;
                }
            }
            foundIt = true;
            System.out.println(i);
            break test;
        }
//        System.out.println(str);
        System.out.println(foundIt ? "Found it" : "Didn't find it");

//        System.out.println(searchMe.charAt(14));
    }
}
