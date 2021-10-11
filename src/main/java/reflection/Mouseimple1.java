package reflection;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Mouseimple1 implements Mouse{

    private String name;
    private int price;
    private static List<String> list = new ArrayList<>();

    @Override
    public Object getObject() {
        return new Mouseimple1("firse", 1000);
    }

    @Override
    public int click() {
        return 0;
    }

    private Mouseimple1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private Mouseimple1(String name) {
        this.name = name;
    }

    public Mouse getMouse(String name, int price){
        return new Mouseimple1(name, price);
    }

    public Mouse getMouse(String name){
        return new Mouseimple1(name);
    }
}
