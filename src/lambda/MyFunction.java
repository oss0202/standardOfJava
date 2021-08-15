package lambda;

@FunctionalInterface
public interface MyFunction {
    int max(int a, int b);
    default void maxMethod(int a, int b){

    }
    static int maxstatic(){
        return 1;
    }
}
