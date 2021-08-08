package generics;

public class Box<T extends String> {// 지네릭 타입 T를 선언
    T item;

    void setItem(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}
