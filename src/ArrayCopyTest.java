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
        Arrays.stream(copyTo).forEach(System.out::println);
        System.out.println("-----------------------------");
        Arrays.stream(copyFrom).forEach(System.out::println);
    }
}
