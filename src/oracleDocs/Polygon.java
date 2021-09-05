package oracleDocs;

import java.util.Arrays;

public class Polygon extends Point{
    private Polygon(int x, int y) {
        super(x, y);
    }

    public static Polygon polygonForm(Point... points){
        for (Point s : points){
            System.out.println(s.toString());
        }
        System.out.println("-----------------");

        Arrays.stream(points)
                .map(point -> {
                        point.x += point.x;
                        return  new Point(point.x, point.y);
                    })
                .map(Point::toString)
                .forEach(System.out::println);
        return new Polygon(7,7);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1,6);
        Point p2 = new Point(2,6);
        Point p3 = new Point(3,6);
        Point p4 = new Point(4,6);
        Polygon polygon = Polygon.polygonForm(p1, p2, p3, p4);
//        System.out.println(polygon);
    }
}
