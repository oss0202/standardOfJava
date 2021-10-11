package reflection;

public class Mouseimple2 implements Mouse{
    @Override
    public Object getObject() {
        return new Mouseimple2();
    }

    @Override
    public int click() {
        return 0;
    }
}
