import java.util.ArrayList;
import java.util.List;

public class ArithmeticOperation {
    public static void main(String[] args) {
        List<String> servers = new ArrayList<>();
        servers.add("1");
        servers.add("2");

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
                stringList.add(String.valueOf(i));
        }

        for (int i = 0; i < stringList.size(); i+=3) {
            if(i< stringList.size()) {
                System.out.print(", " + stringList.get(i));
            }
        }

        System.out.println();

        for (int i = 0; i < stringList.size(); i+=3) {
            if(i+1< stringList.size()){
                System.out.print(", " + stringList.get(i+1));
            }
        }

        System.out.println();

        for (int i = 0; i < stringList.size(); i+=3) {
            if(i+2< stringList.size()) {
                System.out.print(", " + stringList.get(i + 2));
            }
        }


    }
}
