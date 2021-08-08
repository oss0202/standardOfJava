package generics;

public class UseBox {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("ABC");
//        box.setItem(new Object()); String 이외의 타입은 지정불가
        String item = box.getItem()
                ;// 형변환 생략 가능

    }
}
